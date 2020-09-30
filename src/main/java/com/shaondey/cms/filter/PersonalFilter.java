package com.shaondey.cms.filter;

import org.springframework.stereotype.Service;

import javax.servlet.*;
import java.io.IOException;

@Service
public class PersonalFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Personal Filter is called before endpoint execution");
        chain.doFilter(request, response);
        System.out.println("Personal Filter is called after endpoint execution but before returning response");
    }

}
