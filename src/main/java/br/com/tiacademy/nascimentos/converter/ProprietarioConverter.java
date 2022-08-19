package br.com.tiacademy.nascimentos.converter;

import br.com.tiacademy.nascimentos.core.crud.CrudConverter;
import br.com.tiacademy.nascimentos.domain.proprietario;
import br.com.tiacademy.nascimentos.dto.ProprietarioDTO;
import org.springframework.stereotype.Component;


@Component
public class ProprietarioConverter implements CrudConverter<proprietario, ProprietarioDTO> {


    @Override
    public ProprietarioDTO entidadeParaDTO(proprietario entidade) {
        var dto= new ProprietarioDTO();
        dto.setId(entidade.getId());
        dto.setNome(entidade.getNome());

        return dto;
    }

    @Override
    public proprietario dtoParaEntidade(ProprietarioDTO dto) {

        var Proprietario = new proprietario();
        Proprietario.setId(dto.getId());
        Proprietario.setNome(dto.getNome());

        return Proprietario;
    }


}
