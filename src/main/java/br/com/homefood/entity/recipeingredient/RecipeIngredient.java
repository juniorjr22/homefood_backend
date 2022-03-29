package br.com.homefood.entity.recipeingredient;

import br.com.homefood.entity.Ingredient;
import br.com.homefood.entity.Recipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recipe_ingredient")
public class RecipeIngredient {

	@EmbeddedId
	@ToString.Include
	@EqualsAndHashCode.Include
	private RecipeIngredientId id;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("recipeId")
	private Recipe recipe;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("ingredientId")
	@ToString.Include
	@EqualsAndHashCode.Include
	private Ingredient ingredient;

	@Column(name = "ingredient_amount")
	private String ingredientAmount;
	
	@Column(name = "ingredient_description")
	private String ingredientDescription;

}