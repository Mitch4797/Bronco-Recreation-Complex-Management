
package com.cpp.Brcm;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableWebMvc
@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("").setViewName("index");
        registry.addViewController("/login").setViewName("login");
    }
}
