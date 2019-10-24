package policarpio.edlan.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import policarpio.edlan.recipe.model.Category;
import policarpio.edlan.recipe.repository.CategoryRepository;
import policarpio.edlan.recipe.repository.RecipeRepository;
import policarpio.edlan.recipe.repository.UnitOfMeasureRepository;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private RecipeRepository recipeRepository;

    @Autowired
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, RecipeRepository recipeRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println(categoryRepository.findByDescription("American").get().getId());
        System.out.println(unitOfMeasureRepository.findByDescription("Teaspoon").get().getId());
        return "index";
    }

    @RequestMapping({"recipes"})
    public String getRecipies(Model model)
    {
        model.addAttribute("recipeCollection", recipeRepository.findAll());
        return "index";
    }
}
