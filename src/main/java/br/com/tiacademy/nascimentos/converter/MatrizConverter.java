package br.com.tiacademy.nascimentos.converter;

import br.com.tiacademy.nascimentos.core.crud.CrudConverter;
import br.com.tiacademy.nascimentos.domain.Matriz;
import br.com.tiacademy.nascimentos.dto.MatrizDTO;
import org.springframework.stereotype.Component;

@Component
public class MatrizConverter implements CrudConverter<Matriz, MatrizDTO> {

    @Override
    public MatrizDTO entidadeParaDTO(Matriz entidade) {

        var dto = new MatrizDTO();
        dto.setId(entidade.getId());
        dto.setObs(entidade.getObs());
        dto.setStatus(entidade.getStatus());
        //return new MatrizDTO(entidade.getId(),entidade.getObs(),entidade.getStatus());
        return dto;
    }

    @Override
    public Matriz dtoParaEntidade(MatrizDTO dto) {

        var matriz = new Matriz();
        matriz.setId(dto.getId());
        matriz.setObs(dto.getObs());
        matriz.setStatus(dto.getStatus());

        return matriz;
        //return new Matriz(dto.getId(),dto.getObs(),dto.getStatus());
    }
}
