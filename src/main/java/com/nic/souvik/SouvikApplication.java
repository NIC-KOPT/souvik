package com.nic.souvik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;
@EnableTransactionManagement 
@SpringBootApplication
public class SouvikApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SouvikApplication.class);
    }
 
	public static void main(String[] args) {
		SpringApplication.run(SouvikApplication.class, args);
	}
	@Bean
	RestTemplate restTemplate() {
	    return new RestTemplate();
	}

}
