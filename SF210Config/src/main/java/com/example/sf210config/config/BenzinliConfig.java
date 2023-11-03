package com.example.sf210config.config;

import com.example.sf210config.di.Motor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("benzinli")
public class BenzinliConfig {

    @Bean
    public Motor motor() {
        return new Motor("Benzinli");
    }
}
