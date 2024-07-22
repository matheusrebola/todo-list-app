package todolist.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import todolist.entities.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, UUID> {

}
