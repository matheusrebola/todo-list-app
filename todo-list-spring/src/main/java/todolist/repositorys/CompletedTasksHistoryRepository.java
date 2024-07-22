package todolist.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import todolist.entities.CompletedTasksHistory;

@Repository
public interface CompletedTasksHistoryRepository extends JpaRepository<CompletedTasksHistory, UUID> {

}
