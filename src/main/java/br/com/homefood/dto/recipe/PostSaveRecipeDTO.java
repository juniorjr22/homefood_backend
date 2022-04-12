package br.com.homefood.dto.recipe;

import br.com.homefood.classenum.RecipeType;
import br.com.homefood.dto.recipeingredient.SaveRecipeIngredientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostSaveRecipeDTO {
    private String name;
    private RecipeType type;
    private String preparationTime;
    private String preparationMode;
    private List<SaveRecipeIngredientDTO> ingredients;


}
