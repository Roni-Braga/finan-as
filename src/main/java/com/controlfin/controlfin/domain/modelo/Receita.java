package com.controlfin.controlfin.domain.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="receita")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Receita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double valor;
	
	public void receita(dadosReceita dados) {
		this.id = dados.id();
		this.nome = dados.nome();
		this.valor = dados.valor();
	}
}
