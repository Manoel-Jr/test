package com.example.challengeapi.domain.model.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessoResponseTO {

	private Long id;
	private Integer numeroProcesso;
	private String pedidoInternacional;
	private LocalDate dataPublicacao;
	private String requerentes;
	private String titulo;
}
