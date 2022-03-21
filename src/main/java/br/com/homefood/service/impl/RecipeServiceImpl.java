package br.com.homefood.service.impl;

import br.com.homefood.repository.RecipeRepository;
import br.com.homefood.entity.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl /*implements RecipeService*/ {

    @Autowired
    private RecipeRepository repository;

    public List<Recipe> getAllRecipes() {
        return repository.findAll();
    }
}
