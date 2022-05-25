package br.com.homefood.dto.recipe;

import br.com.homefood.dto.recipeingredient.GetAllRecipeIngredientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

    @Data
    @Builder
    @AllArgsConstructor
    public class GetRecipeForIngredientDTO {

        private Integer id;

        private String name;

        private Boolean salty;

        private Boolean candy;

        private String preparationTime;

        private String preparationMode;

        private List<GetAllRecipeIngredientDTO> ingredients;
    }

