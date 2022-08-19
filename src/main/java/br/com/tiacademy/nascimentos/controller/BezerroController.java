package br.com.tiacademy.nascimentos.controller;

import br.com.tiacademy.nascimentos.core.crud.CrudController;
import br.com.tiacademy.nascimentos.domain.Bezerro;
import br.com.tiacademy.nascimentos.dto.BezerroDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bezerro")
public class BezerroController extends CrudController<Bezerro, BezerroDTO, Long> {
}
