package br.com.homefood.service;

import br.com.homefood.entity.Ingredient;

import java.util.List;

public interface IngredientService {

    List<Ingredient> getIngredient();

    Ingredient save(Ingredient ingredient);
}
