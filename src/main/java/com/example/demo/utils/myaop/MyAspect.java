package com.example.demo.utils.myaop;

import com.example.demo.utils.myexception.PublicException;
import com.example.demo.utils.restMessage.RestCode;
import com.example.demo.utils.restMessage.ResultMsg;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Tony on 2017/9/5.
 * com.example.demo.utils.myaop.SpringBootMybatis
 */
@Component
@Aspect
public class MyAspect {

    private static final String URLS = "execution(public * com.example.demo.controller.*.*(..))";

    private static Properties properties;

    private static String urls = null;

    static {
        if (properties == null){
            try {
                properties = new Properties();
                properties.load(MyAspect.class.getResourceAsStream("/urls.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        urls = properties.getProperty("urls");
    }

    @Before(URLS)
    public void getUrls(JoinPoint join) throws IOException, ServletException {
        Object[] args = join.getArgs();
        HttpServletRequest req = (HttpServletRequest) args[0];

        ResultMsg resultMsg = new ResultMsg();

        String requestURI = req.getRequestURI();

        //System.out.println(req.getRequestURI());//獲取當前請求的路徑 { /find.do }
        //System.out.println(req.getRequestURL());//獲取完整請求路徑   { http://localhost:8083/find.do }

        //System.out.println((String) args[2]);
    }
}
