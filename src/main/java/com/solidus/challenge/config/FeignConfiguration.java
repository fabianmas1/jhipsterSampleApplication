package com.solidus.challenge.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.solidus.challenge")
public class FeignConfiguration {

}
