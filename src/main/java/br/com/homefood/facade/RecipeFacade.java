package br.com.homefood.facade;

import br.com.homefood.dto.recipe.GetAllRecipesDTO;
import br.com.homefood.mapper.RecipeMapper;
import br.com.homefood.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
