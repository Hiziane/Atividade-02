package br.com.tiacademy.nascimentos.repository;

import br.com.tiacademy.nascimentos.core.crud.CrudRepository;
import br.com.tiacademy.nascimentos.domain.Matriz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatrizRepository extends CrudRepository<Matriz, Long> {

}
