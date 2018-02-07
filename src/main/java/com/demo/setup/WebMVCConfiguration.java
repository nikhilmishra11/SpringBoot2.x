/**
 * 
 */
package com.demo.setup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author mishrani
 *
 */
@Configuration
@EnableWebMvc
public class WebMVCConfiguration{

	/*@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/demo/**").allowedOrigins("http://localhost:4200");
            }
        };
    }
	*/
}
