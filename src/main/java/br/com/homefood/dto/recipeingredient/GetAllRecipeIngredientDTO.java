package br.com.homefood.dto.recipeingredient;

import br.com.homefood.dto.ingredient.IngredientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class GetAllRecipeIngredientDTO {

    private IngredientDTO ingredient;

}
