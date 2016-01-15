package com.mybank.config;

import com.mybank.config.security.SecurityConfig;
import com.mybank.data.config.DatabaseConfig;
import com.mybank.service.ServiceConfig;
import com.mybank.web.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author Yugov Alexandr.
 */

@Order(Ordered.HIGHEST_PRECEDENCE)
@SpringBootApplication
@ComponentScan
@Import({SecurityConfig.class, DatabaseConfig.class, WebConfig.class, ServiceConfig.class, SchedulingConfig.class})
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
