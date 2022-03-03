package br.com.homefood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.homefood.classenum.TipoReceita;

@Entity
@Table(name = "Receita")
public class Receita {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "tipo")
	@Enumerated(EnumType.STRING)
	private TipoReceita tipo;
	
	@Column(name = "tempoPreparo")
	private String tempoPreparo;
	
	@Column(name = "modoPreparo")
	private String modoPreparo;

}
