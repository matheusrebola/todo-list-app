package todolist.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import todolist.entities.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, UUID> {

}
