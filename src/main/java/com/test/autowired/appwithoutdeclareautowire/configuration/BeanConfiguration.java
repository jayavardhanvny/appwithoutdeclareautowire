package com.test.autowired.appwithoutdeclareautowire.configuration;

import com.test.autowired.appwithoutdeclareautowire.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public User getUserBean() {
        return new User("Vinay");
    }
}
