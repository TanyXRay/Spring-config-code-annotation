package ru.home.chernyadieva.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.home.chernyadieva")
@PropertySource("classpath:audioSystem.properties")
public class SpringConfig {
}
