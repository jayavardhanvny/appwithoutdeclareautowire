package com.test.autowired.appwithoutdeclareautowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.test.autowired.appwithoutdeclareautowire.resources.*")
@SpringBootApplication
public class AppwithoutdeclareautowireApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppwithoutdeclareautowireApplication.class, args);
	}

}
