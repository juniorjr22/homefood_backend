package br.com.homefood.dto.recipeingredient;

import br.com.homefood.dto.ingredient.SaveIngredientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveRecipeIngredientDTO {

    private String ingredientAmount;
    private String ingredientDescription;
    private SaveIngredientDTO ingredient;

}
