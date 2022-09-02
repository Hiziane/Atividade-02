package br.com.tiacademy.nascimentos.controller;

import br.com.tiacademy.nascimentos.core.crud.CrudController;
import br.com.tiacademy.nascimentos.domain.Bezerro;
import br.com.tiacademy.nascimentos.domain.Matriz;
import br.com.tiacademy.nascimentos.domain.proprietario;
import br.com.tiacademy.nascimentos.dto.BezerroDTO;
import br.com.tiacademy.nascimentos.repository.BezerroRepository;
import br.com.tiacademy.nascimentos.service.BezerroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/bezerro")
public class BezerroController extends CrudController<Bezerro, BezerroDTO, Long> {
    @Autowired
    protected BezerroRepository bezerroRepository;
    public BezerroRepository getBezerroRepository() {
        return (BezerroRepository) this.bezerroRepository;
    }
    //  @GetMapping("/matriz={id}/bezerros-matriz")
 //   public List<Bezerro> findByIdIn(@PathParam("id") Matriz id) {
  //      var bezerros = this.bezerroRepository.findByIdIn(id);
  //      return bezerros;
  //  }

    @GetMapping("/proprietario={id}/bezerros-proprietario")
    public List<Bezerro> consultarBezerrosPorProprietario(@PathParam("id") proprietario id) {
        var bezerros = this.getBezerroRepository().constultarBezerrosPorProprietario(id);
        return (bezerros);
    }

    //@GetMapping("/sexo={sexo}/sexo-animal")
    //public List<Bezerro> consultarBezerroPorSexo(@PathParam("sexo") Bezerro sexo) {
    //    var bezerros = this.getBezerroRepository().consultarBezerroPorSexo(sexo);
    //    return bezerros;
   // }

    @GetMapping("/proprietario={id}/bezerros-disponiveis")
    public List<Bezerro> constultaBezerrosDisponiveisProprietario(@PathParam("id") proprietario id) {
        var bezerros = this.getBezerroRepository().constultaBezerrosDisponiveisProprietario(id);
        return bezerros;
    }






}
