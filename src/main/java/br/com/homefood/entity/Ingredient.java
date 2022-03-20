package br.com.homefood.entity;

import br.com.homefood.entity.recipeingredient.RecipeIngredient;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "ingredient")
public class Ingredient {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String name;

	@OneToMany(
			mappedBy = "ingredient",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	private List<RecipeIngredient> recipes;

}
