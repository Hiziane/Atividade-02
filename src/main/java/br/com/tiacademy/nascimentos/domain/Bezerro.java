package br.com.tiacademy.nascimentos.domain;

import br.com.tiacademy.nascimentos.core.crud.CrudDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Bezerro implements CrudDomain<Long>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String registro;
    private LocalDate dataNasc;
    private LocalDate dataVenda;
    private BigDecimal valor;
    private String sexo;
    private String status;
    private String adapar;

    //indica um proprietario e uma matriz para cada bezerro
    @ManyToOne
    @JoinColumn(name="proprietario_id", referencedColumnName = "id")
    private proprietario proprietario;

    @ManyToOne
    @JoinColumn(name = "matriz_id", referencedColumnName = "id")
    private Matriz matriz;

}
