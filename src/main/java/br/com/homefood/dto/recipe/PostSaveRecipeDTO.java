package br.com.homefood.dto.recipe;

import br.com.homefood.classenum.RecipeType;
import br.com.homefood.dto.recipeingredient.SaveRecipeIngredientDTO;

import java.util.List;

public class PostSaveRecipeDTO {
    private String name;
    private RecipeType type;
    private String preparationTime;
    private String preparationMode;
    private List<SaveRecipeIngredientDTO> ingredients;


}
