package com.nic.souvik.configuration;


import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;


@WebFilter("/*")
public class CSPFilter implements Filter {
   

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, 
                         FilterChain chain) throws IOException, ServletException {

        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setHeader("Content-Security-Policy", "script-src 'self' 'unsafe-eval' https: cdnjs.cloudflare.com code.highcharts.com stackpath.bootstrapcdn.com cdn.jsdelivr.net code.jquery.com 'unsafe-inline'; connect-src 'self' news.google.com; worker-src 'self'; manifest-src 'self';");
        chain.doFilter(request, response);  /* Let request continue chain filter */
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
    }
    @Override
    public void destroy() {
    }
}

