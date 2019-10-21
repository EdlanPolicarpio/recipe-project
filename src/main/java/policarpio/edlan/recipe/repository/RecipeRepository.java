package policarpio.edlan.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import policarpio.edlan.recipe.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
