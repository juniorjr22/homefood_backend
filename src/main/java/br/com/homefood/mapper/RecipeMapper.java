package br.com.homefood.mapper;

import br.com.homefood.dto.recipe.GetAllRecipesDTO;
import br.com.homefood.dto.recipe.GetRecipeForIngredientDTO;
import br.com.homefood.dto.recipe.PostSaveRecipeDTO;
import br.com.homefood.entity.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {
        RecipeIngredientMapper.class
})
public interface RecipeMapper {

    GetAllRecipesDTO fromEntityToGetAllRecipesDto(Recipe recipe);

    @Mapping(target = "id", ignore = true)
    Recipe fromPostSaveRecipeDTOToRecipe(PostSaveRecipeDTO saveRecipeDTO);

    GetRecipeForIngredientDTO fromEntityToGetRecipeForIngredientDTO(Recipe recipe);

}
