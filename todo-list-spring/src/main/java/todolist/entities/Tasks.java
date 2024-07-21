package todolist.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Tasks(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String titulo,
		String descricao,
		LocalDateTime dataConclusao,
		Prioridade prioridade,
		Boolean concluida,
		Categoria categoria,
		Users user,
		Categories categorie) {

}
