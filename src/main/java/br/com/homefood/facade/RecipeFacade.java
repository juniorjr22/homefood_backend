package br.com.homefood.facade;

import br.com.homefood.dto.recipe.GetAllRecipesDTO;
import br.com.homefood.dto.recipe.GetRecipeForIngredientDTO;
import br.com.homefood.dto.recipe.PostSaveRecipeDTO;
import br.com.homefood.entity.Recipe;
import br.com.homefood.mapper.RecipeMapper;
import br.com.homefood.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeFacade {

    @Autowired
    private RecipeService service;

    @Autowired
    private RecipeMapper mapper;

    @Transactional(readOnly = true)
    public List<GetAllRecipesDTO> getAllRecipes() {
        return service.getAllRecipes()
                .stream()
                .map(mapper::fromEntityToGetAllRecipesDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public Integer saveRecipe(PostSaveRecipeDTO saveRecipeDTO) {
        Recipe recipe = mapper.fromPostSaveRecipeDTOToRecipe(saveRecipeDTO);
        return service.save(recipe);
    }

    @Transactional(readOnly = true)
    public List<GetRecipeForIngredientDTO> findByIngredients(List<Integer> ids) {
        return service.findByIngredients(ids)
                .stream()
                .map(mapper::fromEntityToGetRecipeForIngredientDTO)
                .collect(Collectors.toList());
    }
}
