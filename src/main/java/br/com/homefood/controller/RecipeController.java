package br.com.homefood.controller;

import br.com.homefood.dto.recipe.GetAllRecipesDTO;
import br.com.homefood.dto.recipe.PostSaveRecipeDTO;
import br.com.homefood.facade.RecipeFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    private RecipeFacade facade;

    @GetMapping(value = "/all")
    public ResponseEntity<List<GetAllRecipesDTO>> getAllRecipes() {
        List<GetAllRecipesDTO> dto = facade.getAllRecipes();
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> saveRecipe(@RequestBody @Valid PostSaveRecipeDTO saveRecipeDto) {
        Integer id = facade.saveRecipe(saveRecipeDto);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
