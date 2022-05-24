package br.com.homefood.mapper;

import br.com.homefood.dto.ingredient.IngredientDTO;
import br.com.homefood.dto.ingredient.SaveIngredientDTO;
import br.com.homefood.dto.recipeingredient.SaveRecipeIngredientDTO;
import br.com.homefood.entity.Ingredient;
import br.com.homefood.entity.RecipeIngredient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IngredientMapper {

    IngredientDTO fromEntityToIngredientDto(Ingredient ingredient);

    @Mapping(target = "id", ignore = true)
    Ingredient fromSaveIngredientDTOToIngredient(SaveIngredientDTO saveRecipeIngredientDTO);

}
