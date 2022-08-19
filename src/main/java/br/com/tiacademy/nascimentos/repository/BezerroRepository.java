package br.com.tiacademy.nascimentos.repository;

import br.com.tiacademy.nascimentos.core.crud.CrudRepository;
import br.com.tiacademy.nascimentos.domain.Bezerro;
import org.springframework.stereotype.Repository;

@Repository
public interface BezerroRepository extends CrudRepository<Bezerro,Long> {
}
