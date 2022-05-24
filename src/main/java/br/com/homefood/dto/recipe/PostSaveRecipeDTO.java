package br.com.homefood.dto.recipe;

import br.com.homefood.dto.recipeingredient.SaveRecipeIngredientDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostSaveRecipeDTO {

    @NotEmpty
    private String name;

    @NotNull
    private Boolean salty;

    @NotNull
    private Boolean candy;

    private String preparationTime;

    @NotEmpty
    private String preparationMode;

    @NotNull
    private Integer amountIngredients;

    @Valid
    private List<SaveRecipeIngredientDTO> ingredients;

}
