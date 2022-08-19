package br.com.tiacademy.nascimentos.controller;

import br.com.tiacademy.nascimentos.core.crud.CrudController;
import br.com.tiacademy.nascimentos.domain.proprietario;
import br.com.tiacademy.nascimentos.dto.ProprietarioDTO;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/proprietario")

public class ProprietarioController extends CrudController<proprietario, ProprietarioDTO, Long> {

}
