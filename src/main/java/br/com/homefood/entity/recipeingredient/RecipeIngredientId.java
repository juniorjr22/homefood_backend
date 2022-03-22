package br.com.homefood.entity.recipeingredient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class RecipeIngredientId implements Serializable {

    @Column(name = "recipe_id")
    private Integer recipeId;

    @Column(name = "ingredient_id")
    private Integer ingredientId;
}
