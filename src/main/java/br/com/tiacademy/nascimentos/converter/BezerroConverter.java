package br.com.tiacademy.nascimentos.converter;

import br.com.tiacademy.nascimentos.core.crud.CrudConverter;
import br.com.tiacademy.nascimentos.domain.Bezerro;
import br.com.tiacademy.nascimentos.dto.BezerroDTO;
import br.com.tiacademy.nascimentos.repository.MatrizRepository;
import br.com.tiacademy.nascimentos.repository.ProprietarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class
BezerroConverter implements CrudConverter<Bezerro, BezerroDTO> {

    private final MatrizConverter matrizConverter;
    private final ProprietarioConverter proprietarioConverter;

    private final MatrizRepository matrizRepository;
    private final ProprietarioRepository proprietarioRepository;

    @Override
    public BezerroDTO entidadeParaDTO(Bezerro entidade) {

        var dto= new BezerroDTO();
        dto.setId(entidade.getId());
        dto.setStatus(entidade.getStatus());
        dto.setAdapar(entidade.getAdapar());
        dto.setDataNasc(entidade.getDataNasc());
        dto.setDataVenda(entidade.getDataVenda());
        dto.setRegistro(entidade.getRegistro());
        dto.setSexo(entidade.getSexo());
        dto.setValor(entidade.getValor());
        dto.setMatriz(matrizConverter.entidadeParaDTO(entidade.getMatriz()));
        dto.setProprietario(proprietarioConverter.entidadeParaDTO(entidade.getProprietario()));

        return dto;
    }

    @Override
    public Bezerro dtoParaEntidade(BezerroDTO dto) {

        var bezerro = new Bezerro();
        bezerro.setId(dto.getId());
        bezerro.setStatus(dto.getStatus());
        bezerro.setAdapar(dto.getAdapar());
        bezerro.setDataNasc(dto.getDataNasc());
        bezerro.setDataVenda(dto.getDataVenda());
        bezerro.setRegistro(dto.getRegistro());
        bezerro.setSexo(dto.getSexo());
        bezerro.setValor(dto.getValor());
        bezerro.setMatriz(matrizRepository.findById(dto.getMatrizId()).orElse(null));
        bezerro.setProprietario(proprietarioRepository.findById(dto.getProprietarioId()).orElse(null));

         return bezerro;
    }
}
