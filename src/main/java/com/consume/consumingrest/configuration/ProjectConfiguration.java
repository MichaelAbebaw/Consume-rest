package com.consume.consumingrest.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.consume.consumingrest.feign")
public class ProjectConfiguration {
}
