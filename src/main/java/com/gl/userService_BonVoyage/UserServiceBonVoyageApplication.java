package com.gl.userService_BonVoyage;


import org.modelmapper.ModelMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceBonVoyageApplication {

	@Bean
	public static ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(UserServiceBonVoyageApplication.class, args);
	}


}
