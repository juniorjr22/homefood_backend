package br.com.homefood.service;

import br.com.homefood.entity.Recipe;

import java.util.List;

public interface RecipeService {

    List<Recipe> getAllRecipes();

    Integer saveRecipe(Recipe recipe);
}
