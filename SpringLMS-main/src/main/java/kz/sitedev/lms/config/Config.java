package kz.sitedev.lms.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "kz.sitedev.lms")
@PropertySource("application.properties")
@EnableJpaRepositories(basePackages = "kz.sitedev.lms.repository")
public class Config {}
