package br.com.tiacademy.nascimentos.dto;

import br.com.tiacademy.nascimentos.domain.Matriz;
import br.com.tiacademy.nascimentos.domain.proprietario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BezerroDTO implements Serializable {

    private Long id;
    private Long matrizId;
    private Long proprietarioId;
    private MatrizDTO matriz;
    private ProprietarioDTO proprietario;
    private String status;
    private String adapar;
    private LocalDate dataNasc;
    private LocalDate dataVenda;
    private String sexo;
    private BigDecimal valor;
    private String registro;


}
