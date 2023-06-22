package com.example.challengeapi.aplication.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

	@Bean
	public ModelMapper model() {
		return new ModelMapper();
	}
	
	@Bean
	public RestTemplate servicoRest() {
		return new RestTemplate();
	}
}
