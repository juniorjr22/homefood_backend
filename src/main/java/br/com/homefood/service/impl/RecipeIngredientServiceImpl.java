package br.com.homefood.service.impl;

import br.com.homefood.entity.Recipe;
import br.com.homefood.entity.RecipeIngredient;
import br.com.homefood.repository.RecipeIngredientRepository;
import br.com.homefood.service.RecipeIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeIngredientServiceImpl implements RecipeIngredientService {

    @Autowired
    RecipeIngredientRepository repository;

    @Override
    public RecipeIngredient save(RecipeIngredient recipeIngredient) {
        return repository.save(recipeIngredient);
    }



}
