package br.com.homefood.entity.recipeingredient;

import br.com.homefood.entity.Ingredient;
import br.com.homefood.entity.Recipe;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "recipe_ingredient")
public class RecipeIngredient {

	@EmbeddedId
	private RecipeIngredientId id;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("recipeId")
	private Recipe recipe;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("ingredientId")
	private Ingredient ingredient;
	
	@Column(name = "ingredient_amount")
	private String ingredientAmount;
	
	@Column(name = "ingredient_description")
	private String ingredientDescription;

}