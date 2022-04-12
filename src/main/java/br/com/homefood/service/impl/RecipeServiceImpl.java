package br.com.homefood.service.impl;

import br.com.homefood.entity.Recipe;
import br.com.homefood.repository.RecipeRepository;
import br.com.homefood.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepository repository;

    public List<Recipe> getAllRecipes() {
        return repository.findAll();
    }

    public Integer saveRecipe(Recipe recipe) {

        Recipe recipeSaved = repository.save(recipe);
        return recipeSaved.getId();
    }
}
