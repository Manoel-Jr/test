package com.example.challengeapi.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsultarApi {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${url.viaprocess}")
	private String urlProcesso;

	public String consumirWebService(Integer numeroProcesso) {

		String url = urlProcesso + numeroProcesso + "/json";
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<>() {
				});
		String body = response.getBody();
		return body;
	}
}
