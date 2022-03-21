package br.com.homefood.facade;

import br.com.homefood.dto.recipe.GetAllRecipesDTO;
import br.com.homefood.mapper.RecipeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import br.com.homefood.service.RecipeService;

@Service
public class RecipeFacade {

    @Autowired
    private RecipeService service;

    @Autowired
    private RecipeMapper mapper;

    public List<GetAllRecipesDTO> getAllRecipes() {
        return service.getAllRecipes()
                .stream()
                .map(mapper::fromEntityToGetAllRecipesDto)
                .collect(Collectors.toList());
    }
}
