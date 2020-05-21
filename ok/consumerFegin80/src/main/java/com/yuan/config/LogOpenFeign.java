package com.yuan.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;


public class LogOpenFeign {
    @Bean
    Logger.Level feign()
    {
        return Logger.Level.FULL;
    }
}
