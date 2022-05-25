package br.com.homefood.service.impl;

import br.com.homefood.entity.Ingredient;
import br.com.homefood.entity.Recipe;
import br.com.homefood.entity.RecipeIngredient;
import br.com.homefood.repository.RecipeRepository;
import br.com.homefood.service.IngredientService;
import br.com.homefood.service.RecipeIngredientService;
import br.com.homefood.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository repository;

    @Autowired
    private IngredientService ingredientService;

    @Autowired
    private RecipeIngredientService recipeIngredientService;

    public List<Recipe> getAllRecipes() {
        return repository.findAll();
    }

    public Integer save(Recipe recipe) {
        if (repository.findByName(recipe.getName()).isPresent()) {
            throw new IllegalArgumentException("A recipe with the same name already exists");
        }

        List<RecipeIngredient> recipeIngredients = recipe.getIngredients();
        Recipe recipeSaved = repository.save(recipe);
        for (RecipeIngredient recipeIngredient : recipeIngredients) {
            if (recipeIngredient.getIngredient() != null) {
                Ingredient ingredientSaved = ingredientService.save(recipeIngredient.getIngredient());
                recipeIngredient.setIngredient(ingredientSaved);
            }
            recipeIngredient.setRecipe(recipeSaved);
            recipeIngredientService.save(recipeIngredient);
        }
        return recipeSaved.getId();
    }

    public List<Recipe> findByIngredients(List<Integer> ids) {
        return repository.findByIngredients(ids);
    }



}
