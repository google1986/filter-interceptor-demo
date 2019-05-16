package com.htzw.demo.web.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/**
 * @author Administrator
 */

@WebFilter(urlPatterns = "/*", filterName = "thirdFilter1")
@Slf4j
public class ThirdFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("================ThirdFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("================ThirdFilter start");
        long startTime = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        long endTime = System.currentTimeMillis();
        log.info("================ThirdFilter consume " + (endTime - startTime) + " ms");
        log.info("================ThirdFilter end");
    }

    @Override
    public void destroy() {
        log.info("================ThirdFilter init");
    }
}
