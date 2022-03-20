package br.com.homefood.entity.recipeingredient;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RecipeIngredientId implements Serializable {

    @Column(name = "recipe_id")
    private Integer recipeId;

    @Column(name = "ingredient_id")
    private Integer ingredientId;
}
