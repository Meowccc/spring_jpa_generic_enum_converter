package com.example.generic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @author meow
 */
@Configuration
public class BeanConfig {

    @Bean
    public Random random() {
        return new Random();
    }
}
