package com.soumya.config;

import com.soumya.beans.Address;
import com.soumya.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Address getAddress() {
        return new Address(1234,"TR Street.");
    }

    @Bean
    public Person getPerson() {
        return new Person(1,"RT",getAddress());
    }

}
