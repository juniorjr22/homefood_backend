package br.com.homefood.dto.recipeingredient;

import br.com.homefood.dto.ingredient.SaveIngredientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveRecipeIngredientDTO {

    @NotEmpty
    private String ingredientDescription;

    @Valid
    private SaveIngredientDTO ingredient;

}
