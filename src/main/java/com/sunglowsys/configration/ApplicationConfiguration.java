package com.sunglowsys.configration;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public Student getStudent() {

        return new Student();
    }

    @Bean
    public Address getAddress() {

        return new Address();
    }
}
