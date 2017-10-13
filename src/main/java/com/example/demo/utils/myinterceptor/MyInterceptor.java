package com.example.demo.utils.myinterceptor;

import com.example.demo.utils.restMessage.RestCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * Created by Tony on 2017/10/10.
 * com.example.demo.utils.myinterceptor.SpringBootMybatis
 * 描述：配置拦截器
 */
public class MyInterceptor implements HandlerInterceptor {

    private static Properties properties;

    private static String urls = null;

    static {
        if (properties == null){
            try {
                properties = new Properties();
                properties.load(MyInterceptor.class.getResourceAsStream("/urls.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        urls = properties.getProperty("urls");
    }

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String requestURI = httpServletRequest.getRequestURI();
        String url = null;
        String[] split = urls.split(",");
        for (String url1: split) {
            if (url1.equals(requestURI)){
                url = url1;
                break;
            }
        }
        if (httpServletRequest.getRequestURI().equals(url)){
            return true;
        }
        String method = httpServletRequest.getMethod();
        String header = httpServletRequest.getHeader("X-Token");
        if (StringUtils.isBlank(header)){
            PrintWriter writer = httpServletResponse.getWriter();
            String message = "{\"code\":\""+RestCode.NOTLOGIN+"\"}";
            writer.print(message);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
