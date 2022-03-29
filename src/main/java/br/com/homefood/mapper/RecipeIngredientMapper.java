package br.com.homefood.mapper;

import br.com.homefood.dto.recipeingredient.GetAllRecipeIngredientDTO;
import br.com.homefood.entity.recipeingredient.RecipeIngredient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        IngredientMapper.class
})
public interface RecipeIngredientMapper {

    GetAllRecipeIngredientDTO fromEntityToGetAllRecipeIngredientDto(RecipeIngredient recipeIngredient);

}
