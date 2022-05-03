package br.com.homefood.repository;

import br.com.homefood.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

    @Query(nativeQuery = true, value = "select DISTINCT r.id, r.name from recipe r" +
            "left join recipe_ingredient ri on ri.recipe_id = r.id" +
            "where ri.ingredient_id in (:ids) and r.id not in" +
            "(" +
            "select r.id from recipe r" +
            "left join recipe_ingredient ri on ri.recipe_id = r.id" +
            "where ri.ingredient_id not in (:ids)" +
            ");")
    List<Recipe> getRecipeForIngredientDTO(@Param("ids") List<Integer> ids);


}
