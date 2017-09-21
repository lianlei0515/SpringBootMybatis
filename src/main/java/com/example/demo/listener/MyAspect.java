package com.example.demo.listener;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Tony on 2017/9/5.
 * com.example.demo.listener.SpringBootMybatis
 */
@Component
@Aspect
public class MyAspect {

    private static final String URLS = "execution(public * com.example.demo.controller.*.*(..))";

    @Before(URLS)
    public void getUrls(JoinPoint join) throws IOException, ServletException {
        Object[] args = join.getArgs();
        HttpServletRequest req = (HttpServletRequest) args[0];
        System.out.println(req.getRequestURI());//獲取當前請求的路徑 { /find.do }
        System.out.println(req.getRequestURL());//獲取完整請求路徑   { http://localhost:8083/find.do }

        //System.out.println((String) args[2]);
    }

}
