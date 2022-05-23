package br.com.homefood.dto.ingredient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveIngredientDTO {

    @NotEmpty
    @Pattern(regexp = "([a-z]+)|([a-z]+[^A-Z\\d])|([a-z]+[^A-Z\\d][a-z])|([^A-Z\\d][a-z])", message = "The ingredient name must be lowercase")
    private String name;

}
