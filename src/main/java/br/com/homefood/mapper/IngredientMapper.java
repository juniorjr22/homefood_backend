package br.com.homefood.mapper;

import br.com.homefood.dto.ingredient.IngredientDTO;
import br.com.homefood.entity.Ingredient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IngredientMapper {

    IngredientDTO fromEntityToIngredientDto(Ingredient ingredient);

}
