package br.com.tiacademy.nascimentos.controller;

import br.com.tiacademy.nascimentos.core.crud.CrudController;
import br.com.tiacademy.nascimentos.domain.Bezerro;
import br.com.tiacademy.nascimentos.domain.Matriz;
import br.com.tiacademy.nascimentos.domain.proprietario;
import br.com.tiacademy.nascimentos.dto.BezerroResumoDTO;
import br.com.tiacademy.nascimentos.dto.MatrizDTO;
import br.com.tiacademy.nascimentos.repository.BezerroRepository;
import br.com.tiacademy.nascimentos.service.BezerroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
@RequestMapping("/matriz")
public class MatrizController extends CrudController<Matriz, MatrizDTO, Long> {

    @Autowired
    protected BezerroRepository bezerroRepository;
    public BezerroRepository getBezerroRepository() {
        return (BezerroRepository) this.bezerroRepository;
    }

    @GetMapping("/{id}/meus-bezerros")
    public List<Bezerro> constultarBezerrosPorMatriz(@PathParam("id") Matriz id) {
        var bezerros = this.getBezerroRepository().constultarBezerrosPorMatriz(id);
        return bezerros;
    }
}
