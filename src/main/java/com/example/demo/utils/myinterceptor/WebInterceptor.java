package com.example.demo.utils.myinterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Tony on 2017/10/10.
 * com.example.demo.utils.myinterceptor.SpringBootMybatis
 * 描述：加载拦截器和设置拦截的路径
 */
@Configuration
public class WebInterceptor extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
