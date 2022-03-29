package br.com.homefood.dto.recipe;

import br.com.homefood.classenum.RecipeType;
import br.com.homefood.dto.recipeingredient.GetAllRecipeIngredientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class GetAllRecipesDTO {

    private Integer id;

    private String name;

    private RecipeType type;

    private String preparationTime;

    private String preparationMode;

    private List<GetAllRecipeIngredientDTO> ingredients;
}
