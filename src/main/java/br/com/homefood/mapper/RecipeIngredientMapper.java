package br.com.homefood.mapper;

import br.com.homefood.dto.recipe.PostSaveRecipeDTO;
import br.com.homefood.dto.recipeingredient.GetAllRecipeIngredientDTO;
import br.com.homefood.dto.recipeingredient.SaveRecipeIngredientDTO;
import br.com.homefood.entity.Recipe;
import br.com.homefood.entity.RecipeIngredient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {
        IngredientMapper.class
})
public interface RecipeIngredientMapper {

    GetAllRecipeIngredientDTO fromEntityToGetAllRecipeIngredientDto(RecipeIngredient recipeIngredient);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "recipe", ignore = true)
    RecipeIngredient fromSaveRecipeIngredientDTOToRecipeIngredient(SaveRecipeIngredientDTO saveRecipeIngredientDTO);

}
