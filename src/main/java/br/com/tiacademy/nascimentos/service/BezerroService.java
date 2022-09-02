package br.com.tiacademy.nascimentos.service;

import br.com.tiacademy.nascimentos.core.crud.CrudService;
import br.com.tiacademy.nascimentos.domain.Bezerro;
import br.com.tiacademy.nascimentos.dto.BezerroDTO;
import br.com.tiacademy.nascimentos.dto.BezerroResumoDTO;
import br.com.tiacademy.nascimentos.repository.BezerroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BezerroService extends CrudService<Bezerro,Long> {

    @Override
    protected Bezerro editarEntidade(Bezerro recuperado, Bezerro entidade) {
        recuperado.setId(entidade.getId());
        recuperado.setStatus(entidade.getStatus());
        recuperado.setAdapar(entidade.getAdapar());
        recuperado.setDataNasc(entidade.getDataNasc());
        recuperado.setDataVenda(entidade.getDataVenda());
        recuperado.setRegistro(entidade.getRegistro());
        recuperado.setSexo(entidade.getSexo());
        recuperado.setValor(entidade.getValor());
        recuperado.setProprietario(entidade.getProprietario());
        recuperado.setMatriz(entidade.getMatriz());

        return recuperado;
    }

    public List<BezerroResumoDTO> bezerroResumo(List<Bezerro> bezerros) {
        var bezerroDto = bezerros.stream().map(bezerro -> new BezerroResumoDTO(
                bezerro.getId(),
                bezerro.getStatus(),
                bezerro.getDataNasc(),
                bezerro.getSexo(),
                bezerro.getRegistro())).collect(Collectors.toList());

        return bezerroDto;
    }


}
