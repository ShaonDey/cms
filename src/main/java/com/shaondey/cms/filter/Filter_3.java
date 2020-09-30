package com.shaondey.cms.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.servlet.*;
import java.io.IOException;

@Service
@Order(2)
public class Filter_3 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter 3 is called before endpoint execution");
        chain.doFilter(request, response);
        System.out.println("Filter 3 is called after endpoint execution but before returning response");
    }

}
