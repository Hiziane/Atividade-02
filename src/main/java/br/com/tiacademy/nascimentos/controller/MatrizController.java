package br.com.tiacademy.nascimentos.controller;

import br.com.tiacademy.nascimentos.core.crud.CrudController;
import br.com.tiacademy.nascimentos.domain.Matriz;
import br.com.tiacademy.nascimentos.dto.MatrizDTO;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/matriz")

public class MatrizController extends CrudController<Matriz, MatrizDTO, Long> {


}
