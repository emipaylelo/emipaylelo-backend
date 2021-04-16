package com.emipaylelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.emipaylelo")
@EntityScan("com.emipaylelo.model")
public class EmipayleloApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmipayleloApplication.class, args);
	}

}
