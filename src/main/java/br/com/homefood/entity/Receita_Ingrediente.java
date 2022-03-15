package br.com.homefood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipes_ingredients")
public class Receita_Ingrediente {
	
	@Id
	@Column(name = "idrecipes")
	private Integer idReceita;
	
	@Id
	@Column(name = "idingredients")
	private Integer idIngrediente;
	
	@Column(name = "amountingredients")
	private Integer quantidadeIngrediente;
	
	@Column(name = "descripitoningredients")
	private String descricaoIngrediente;

}



