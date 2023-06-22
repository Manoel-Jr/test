package com.example.challengeapi.domain.service;

import com.example.challengeapi.domain.model.dto.response.ProcessoResponseTO;

public interface ProcessoService {

	public ProcessoResponseTO consultar(Integer numeroProcesso);
}
