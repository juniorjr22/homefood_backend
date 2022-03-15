package br.com.homefood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingrediente {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "names")
	private String nome; 

}
