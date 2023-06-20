package com.example.ad.configuration;

import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;

public interface WebMvcConfigurerAdapter {
    void configureContentNegotiation(ContentNegotiationConfigurer configurer);
}
