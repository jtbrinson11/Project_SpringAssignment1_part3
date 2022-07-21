package org.SpringAssignment1_part3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.SprintAssessment1_part3")
public class AppConfig {

    @Bean
    public Address getAddress()
    {
        return new Address();
    }

    @Bean
    public Phone getPhone()
    {
        return new Phone();
    }

    @Bean
    public student getstudent()
    {
        return new student();
    }
}
