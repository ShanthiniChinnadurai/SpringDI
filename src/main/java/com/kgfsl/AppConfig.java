package com.kgfsl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.kgfsl")
public class AppConfig {
   @Bean
   public Employee aaa() {
      return new EmployeeImp();
   }
}