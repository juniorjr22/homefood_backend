package br.com.homefood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Receita_Ingrediente")
public class Receita_Ingrediente {
	
	@Id
	@Column(name = "idReceita")
	private Integer idReceita;
	
	@Id
	@Column(name = "idIngrediente")
	private Integer idIngrediente;
	
	@Column(name = "quantidadeIngrediente")
	private Integer quantidadeIngrediente;
	
	@Column(name = "descricaoIngrediente")
	private String descricaoIngrediente;

}



