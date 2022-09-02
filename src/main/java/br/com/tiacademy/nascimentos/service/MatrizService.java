package br.com.tiacademy.nascimentos.service;

import br.com.tiacademy.nascimentos.core.crud.CrudService;
import br.com.tiacademy.nascimentos.domain.Matriz;
import br.com.tiacademy.nascimentos.domain.proprietario;
import org.springframework.stereotype.Service;


@Service
public class MatrizService extends CrudService<Matriz,Long> {

    @Override
    protected Matriz editarEntidade(Matriz recuperado, Matriz entidade){
        recuperado.setObs(entidade.getObs());
        recuperado.setStatus(entidade.getStatus());

        return recuperado;
    }

   // @Autowired
   // private MatrizRepository matrizRepository;

    //public List<Matriz> listar(){
       // return matrizRepository.findAll();
   // }

   // public Matriz criar(Matriz matriz){
       // return repository.save(matriz);
    //}

    //public Matriz editar(Long id, Matriz editado){
  //     var recuperado =  porId(id);

      // if(Objects.isNull(recuperado)){
           //tratar null
      // }
       // somente o status pode ser alterado
    //   recuperado.setStatus(editado.getStatus());

   //    return repository.save(recuperado);
   // }

   // public void excluir(Long id){
       // repository.deleteById(id);
    //}
}
