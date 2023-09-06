package org.example.conf;

import lombok.extern.java.Log;
import org.example.component.Engine;
import org.example.component.Transmission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Log
@Configuration
@ComponentScan("org.example")
public class Config {
    @Bean
    public Engine engine() {
        return new Engine("V8", 8);
    }
    @Bean
    public Transmission transmission() {
        return new Transmission("Automatic");
    }
}