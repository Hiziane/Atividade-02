package br.com.tiacademy.nascimentos.service;

import br.com.tiacademy.nascimentos.core.crud.CrudService;
import br.com.tiacademy.nascimentos.domain.proprietario;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class ProprietarioService extends CrudService<proprietario,Long> {

    @Override
    protected proprietario editarEntidade(proprietario recuperado, proprietario entidade){
        recuperado.setNome(entidade.getNome());

        return recuperado;
    }

}
