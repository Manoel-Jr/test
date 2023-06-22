package com.example.challengeapi.domain.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "processos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Processo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "numeroProcesso")
	private Integer numeroProcesso;

	@Column(name = "pedidoInternacional")
	private String pedidoInternacional;

	@Column(name = "dataPublicacao")
	private LocalDateTime dataPublicacao;

	@Column(name = "requerentes")
	private String requerentes;

	@Column(name = "titulo")
	private String titulo;
}
