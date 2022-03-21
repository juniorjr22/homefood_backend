package br.com.homefood.dto.ingredient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class IngredientDTO {

    private Integer id;

    private String name;

}
