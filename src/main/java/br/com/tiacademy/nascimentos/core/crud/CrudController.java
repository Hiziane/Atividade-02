package br.com.tiacademy.nascimentos.core.crud;

import br.com.tiacademy.nascimentos.domain.Matriz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class CrudController <T extends CrudDomain<ID>,D,ID> {

    @Autowired
    protected  CrudService<T,ID>service;

    @Autowired
    protected CrudConverter<T,D>converter;

    @GetMapping
    public ResponseEntity<Page<D>>paginada(Pageable pageable){

        var listaPaginada= service.paginada(pageable).map(converter::entidadeParaDTO);
        return ResponseEntity.ok(listaPaginada);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<D>> listar() {

       // var listaEntidade  =  service.listar();
       // return ResponseEntity.ok(listaEntidade);

        var listaDto= service.listar().stream()
                .map(converter::entidadeParaDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(listaDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<D>especifico(@PathVariable("id") ID id){

        var entidade = service.porId(id);

        if(Objects.isNull(entidade)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(converter.entidadeParaDTO(entidade));

    }

    @PostMapping
    public ResponseEntity<D> criar(@RequestBody D dto) {
         var entidade = converter.dtoParaEntidade(dto);
         var salvo = service.criar(entidade);

        //var salvo = service.criar(dto);
        ServletUriComponentsBuilder builder = ServletUriComponentsBuilder.fromCurrentRequest();
        var uri = builder.path("/{id}").buildAndExpand(salvo.getId()).toUri();

        return ResponseEntity.created(uri).body(converter.entidadeParaDTO(salvo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<D>editar(@PathVariable("id") ID id, @RequestBody D dto){

        var novaentidade= converter.dtoParaEntidade(dto);
        var salvo= service.editar(id,novaentidade);

        return ResponseEntity.ok(converter.entidadeParaDTO(salvo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>excluir(@PathVariable("id") ID id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
