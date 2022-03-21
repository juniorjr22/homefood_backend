package br.com.homefood.dto.recipe;

import br.com.homefood.classenum.RecipeType;
import br.com.homefood.entity.recipeingredient.RecipeIngredient;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class GetAllRecipesDTO {

    private Integer id;

    private String name;

    private RecipeType type;

    private String preparationTime;

    private String preparationMode;

    private List<RecipeIngredient> ingredients;

}
