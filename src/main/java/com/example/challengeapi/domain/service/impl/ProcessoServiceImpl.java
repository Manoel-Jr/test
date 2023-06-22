package com.example.challengeapi.domain.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.challengeapi.domain.model.dto.response.ProcessoResponseTO;
import com.example.challengeapi.domain.model.entity.Processo;
import com.example.challengeapi.domain.service.ProcessoService;
import com.google.gson.Gson;

@Service
public class ProcessoServiceImpl implements ProcessoService {

	@Autowired
	private ConsultarApi api;

	@Autowired
	private ModelMapper mapper;

	@Override
	public ProcessoResponseTO consultar(Integer numeroProcesso) {
		String response = api.consumirWebService(numeroProcesso);
		Gson gson = new Gson();
		Processo ApiResponse = gson.fromJson(response, Processo.class);
		ProcessoResponseTO processoTO = mapper.map(ApiResponse, ProcessoResponseTO.class);
		return processoTO;
	}

}
