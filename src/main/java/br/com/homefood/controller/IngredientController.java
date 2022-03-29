package br.com.homefood.controller;

import br.com.homefood.dto.ingredient.IngredientDTO;
import br.com.homefood.dto.recipe.GetAllRecipesDTO;
import br.com.homefood.facade.IngredientFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    @Autowired
    private IngredientFacade facade;

    @GetMapping
    public ResponseEntity<List<IngredientDTO>> getIngredients() {
        List<IngredientDTO> dto = facade.getIngredient();
        return new ResponseEntity<>(dto, HttpStatus.OK);

    }

}
