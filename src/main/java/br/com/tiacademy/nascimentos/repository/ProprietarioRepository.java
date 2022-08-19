package br.com.tiacademy.nascimentos.repository;

import br.com.tiacademy.nascimentos.core.crud.CrudRepository;
import br.com.tiacademy.nascimentos.domain.proprietario;
import org.springframework.stereotype.Repository;

@Repository

public interface ProprietarioRepository  extends CrudRepository<proprietario,Long> {

}
