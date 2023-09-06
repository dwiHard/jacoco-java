package org.example.conf;

import lombok.extern.java.Log;
import org.example.bean.Engine;
import org.example.bean.Transmission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Log
@Configuration
@ComponentScan("org.example.bean")
public class ConfigBean {
    @Bean
    public Engine engine() {
        return new Engine("V8", 8);
    }
    @Bean
    public Transmission transmission() {
        return new Transmission("Automatic");
    }
}