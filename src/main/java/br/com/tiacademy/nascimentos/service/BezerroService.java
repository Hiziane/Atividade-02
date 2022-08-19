package br.com.tiacademy.nascimentos.service;

import br.com.tiacademy.nascimentos.core.crud.CrudService;
import br.com.tiacademy.nascimentos.domain.Bezerro;
import org.springframework.stereotype.Service;

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

}
