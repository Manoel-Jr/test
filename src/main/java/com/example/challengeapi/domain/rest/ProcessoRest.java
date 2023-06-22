package com.example.challengeapi.domain.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.challengeapi.domain.model.dto.response.ProcessoResponseTO;
import com.example.challengeapi.domain.service.ProcessoService;

@RestController
public class ProcessoRest {

	@Autowired
	private ProcessoService processoService;

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/consultar-numero-de-processo/{numeroProcesso}")
	public ResponseEntity<ProcessoResponseTO> consultar(@PathVariable Integer numeroProcesso) {
		return new ResponseEntity<>(processoService.consultar(numeroProcesso), HttpStatus.OK);
	}
}
