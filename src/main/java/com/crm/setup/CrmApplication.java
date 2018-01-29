package com.crm.setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.crm.web")
@EnableJpaRepositories("com.crm.web")
@EntityScan("com.crm.jpa.model")
public class CrmApplication {

	public static void main(String[] args) {
		SpringApplication.run( new Class[] { 
				CrmApplication.class, 
				ServletInitializer.class
			}, 
			args);
	}
}
