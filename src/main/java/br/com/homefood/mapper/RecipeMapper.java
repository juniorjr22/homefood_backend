package br.com.homefood.mapper;

import br.com.homefood.dto.recipe.GetAllRecipesDTO;
import br.com.homefood.entity.Recipe;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    GetAllRecipesDTO fromEntityToGetAllRecipesDto(Recipe recipe);

}
