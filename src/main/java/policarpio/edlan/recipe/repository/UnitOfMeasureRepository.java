package policarpio.edlan.recipe.repository;

import org.springframework.data.repository.CrudRepository;
import policarpio.edlan.recipe.model.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
