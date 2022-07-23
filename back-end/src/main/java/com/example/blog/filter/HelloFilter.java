package com.example.blog.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

@Slf4j
@Component
@Order(1)
@WebFilter(value = "/**")
public class HelloFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info(filterConfig.getFilterName() + " [init] ");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("HelloFilter: [doFilter] begin");
        LocalDateTime start = LocalDateTime.now();
        filterChain.doFilter(servletRequest, servletResponse);
        LocalDateTime end = LocalDateTime.now();
        log.info("HelloFilter: [doFilter] end");
        log.info("Total Time: {}", Duration.between(start, end).toMillis());
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
