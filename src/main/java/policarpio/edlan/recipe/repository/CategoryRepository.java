package policarpio.edlan.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import policarpio.edlan.recipe.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
