package com.empreget.model;

import java.time.LocalDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.internal.constraintvalidators.hv.br.CPFValidator;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cliente {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank
	@Size(max = 60)
	private String nome;

	@Embedded
	private Endereco endereco;

	@NotBlank
	@Size(max = 10)
	private String rg;

	@NotBlank(message = "CPF é obrigatório.")
	@CPF
	private String cpf;

	@NotBlank
	@Size(max = 20)
	private String telefone;

	@Email
	@NotBlank
	@Size(max = 255)
	private String email;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime dataDoCadastro;

}
