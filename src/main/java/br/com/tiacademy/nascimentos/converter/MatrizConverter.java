package br.com.tiacademy.nascimentos.converter;

import br.com.tiacademy.nascimentos.core.crud.CrudConverter;
import br.com.tiacademy.nascimentos.domain.Matriz;
import br.com.tiacademy.nascimentos.dto.MatrizDTO;
import org.springframework.stereotype.Component;

@Component
public class MatrizConverter implements CrudConverter<Matriz, MatrizDTO> {

    @Override
    public MatrizDTO entidadeParaDTO(Matriz entidade) {

        return new MatrizDTO(entidade.getId(),entidade.getObs(),entidade.getStatus());
    }

    @Override
    public Matriz dtoParaEntidade(MatrizDTO dto) {
        return new Matriz(dto.getId(),dto.getObs(),dto.getStatus());
    }
}
