package com.shaondey.cms.config;

import com.shaondey.cms.filter.CustomerFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<CustomerFilter> registerCustomerFilterBean() {
        FilterRegistrationBean<CustomerFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CustomerFilter());
        registrationBean.addUrlPatterns("/customers/*");
        return registrationBean;
    }

}
