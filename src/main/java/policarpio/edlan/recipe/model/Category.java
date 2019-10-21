package policarpio.edlan.recipe.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    @ManyToMany(mappedBy = "categorySet")
    private Set<Recipe> recipeSet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipeSet() {
        return recipeSet;
    }

    public void setRecipeSet(Set<Recipe> recipeSet) {
        this.recipeSet = recipeSet;
    }
}
