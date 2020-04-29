package siit.proiect.recipes.controller;

import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import siit.proiect.recipes.model.Category;
import siit.proiect.recipes.model.Recipe;
import siit.proiect.recipes.model.RecipesRepository;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("recipes")
public class RecipesController {

    @Autowired
    private RecipesRepository repo;


    @GetMapping // recipes/
    public String showHome(Model model, @RequestParam(defaultValue = "0") int page) {

        model.addAttribute("data", repo.findAll(PageRequest.of(page, 6)));
        model.addAttribute("currentPage", page);
        return "home";
    }

    @GetMapping("/{id}") // recipes?id=1
    public String getRecipeById(@PathVariable Long id) {

        Recipe recipe = repo.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("addRecipeForm");

        modelAndView.addObject("recipeToEdit", recipe);

        return "redirect:/recipes";
    }

    @GetMapping("about")
    public ModelAndView aboutMePage() {

        ModelAndView modelAndView = new ModelAndView("aboutMe");
        return modelAndView;
    }

    @GetMapping(path = "salad")
    public String getRecipeSalad(Model model) {

        List<Recipe> recipesSaladList = repo.findByCategoryOrderByLastModify(Category.SALAD);
        if(recipesSaladList.isEmpty()){
            return "noRecipe";
        }
        model.addAttribute("data", recipesSaladList);
        return "home";
    }

    @GetMapping(path = "soup")
    public String getRecipeSoup(Model model) {

        List<Recipe> recipesSoupList = repo.findByCategoryOrderByLastModify(Category.SOUP);
        if(recipesSoupList.isEmpty()){
            return "noRecipe";
        }
        model.addAttribute("data", recipesSoupList);
        return "home";
    }

    @GetMapping(path = "main-dish")
    public String getRecipeMainDish(Model model) {

        List<Recipe> recipesList = repo.findByCategoryOrderByLastModify(Category.MAIN_DISH);
        if(recipesList.isEmpty()){
            return "noRecipe";
        }
        model.addAttribute("data", recipesList);
        return "home";
    }

    @GetMapping(path = "dessert")
    public String getRecipeDessert(Model model) {

        List<Recipe> recipesList = repo.findByCategoryOrderByLastModify(Category.DESSERT);
        if(recipesList.isEmpty()){
            return "noRecipe";
        }
        model.addAttribute("data", recipesList);
        return "home";
    }

    @GetMapping(path = "miscellaneous")
    public String getRecipeMiscellaneous(Model model) {

        List<Recipe> recipesList = repo.findByCategoryOrderByLastModify(Category.MISCELLANEOUS);
        if(recipesList.isEmpty()){
            return "noRecipe";
        }
        model.addAttribute("data", recipesList);
        return "home";
    }

    @GetMapping(path = "add")
    public ModelAndView recipeAddForm() {
        ModelAndView modelAndView = new ModelAndView("addRecipeForm");
        modelAndView.addObject("recipeToAdd", new Recipe());

        return modelAndView;
    }

    @PostMapping(path = "add")
    public String recipeSubmit(@ModelAttribute(name = "recipeToAdd") @Valid Recipe recipe, BindingResult result) {
        if (result.hasErrors()) {
            return "addRecipeForm";
        }

        recipe.setCreated(new Date());

        repo.save(recipe);
        return "redirect:/recipes";
    }


    @PostMapping
    public String deleteRecipeById(@RequestParam("idRecipe") Long id) {
        repo.deleteById(id);
        return "redirect:/recipes";
    }


    @PostMapping(path = "edit/{id}")
    public String saveRecipe(@ModelAttribute(name = "recipeToEdit") @Valid Recipe recipe, BindingResult result) {

        if (result.hasErrors()) {
            return "editRecipe";
        }

        recipe.setLastModify(new Date());
        repo.save(recipe);

        return "redirect:/recipes";
    }


    @GetMapping("edit/{id}")
    public ModelAndView showEditPage(@PathVariable(name = "id") Long id) {

        Recipe recipe = repo.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("editRecipe");
        modelAndView.addObject("recipeToEdit", recipe);
        return modelAndView;

    }

    @GetMapping("view/{id}")
    public ModelAndView recipePage(@PathVariable(name = "id") Long id) {

        Recipe recipe = repo.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("recipePage");
        modelAndView.addObject("recipe", recipe);
        return modelAndView;

    }

}

