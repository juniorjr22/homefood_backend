package br.com.homefood.facade;

import br.com.homefood.dto.ingredient.IngredientDTO;
import br.com.homefood.mapper.IngredientMapper;
import br.com.homefood.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IngredientFacade {

    @Autowired
    private IngredientService service;

    @Autowired
    private IngredientMapper mapper;

    public List<IngredientDTO> getIngredient() {
        return service.getIngredient()
                .stream()
                .map(mapper::fromEntityToIngredientDto)
                .collect(Collectors.toList());
    }

}
