package br.com.homefood.service.impl;

import br.com.homefood.entity.Ingredient;
import br.com.homefood.repository.IngredientRepository;
import br.com.homefood.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientRepository repository;

    @Override
    public List<Ingredient> getIngredient() {
        return repository.findAll();
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        return repository.save(ingredient);
    }
}
