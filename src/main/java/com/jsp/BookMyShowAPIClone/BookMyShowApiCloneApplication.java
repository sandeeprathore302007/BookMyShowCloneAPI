package com.jsp.BookMyShowAPIClone;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class BookMyShowApiCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApiCloneApplication.class, args);
	}
	@Bean
	public ModelMapper getModelMapper()
	{
		return new ModelMapper();
	}

}
 