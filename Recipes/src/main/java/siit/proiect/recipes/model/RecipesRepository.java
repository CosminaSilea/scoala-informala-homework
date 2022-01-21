package siit.proiect.recipes.model;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipesRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAllByOrderByName();

    List<Recipe> findByCategoryOrderByLastModify(Category category);

//    List<Recipe> findAllByOrderLastModify();
//    List<Recipe> findAllByOrderCreated();

}

