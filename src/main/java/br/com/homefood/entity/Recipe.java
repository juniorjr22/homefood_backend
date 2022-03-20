package br.com.homefood.entity;

import br.com.homefood.classenum.RecipeType;
import br.com.homefood.entity.recipeingredient.RecipeIngredient;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private RecipeType type;
	
	@Column(name = "preparation_time")
	private String preparationTime;
	
	@Column(name = "preparation_mode")
	private String preparationMode;

	@OneToMany(
			mappedBy = "recipe",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	private List<RecipeIngredient> ingredients;

}
