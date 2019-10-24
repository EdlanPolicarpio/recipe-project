package policarpio.edlan.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import policarpio.edlan.recipe.model.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
