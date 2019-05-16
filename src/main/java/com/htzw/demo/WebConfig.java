package com.htzw.demo;


import com.htzw.demo.web.interceptor.FirstInterceptor;
import com.htzw.demo.web.interceptor.SecondInterceptor;
import com.htzw.demo.web.interceptor.ThirdInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author Administrator
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new SecondInterceptor()).addPathPatterns("/poss/hello");
        registry.addInterceptor(new FirstInterceptor()).addPathPatterns("/poss/test");
        registry.addInterceptor(new ThirdInterceptor()).addPathPatterns("/poss/hello");
    }
}
