package br.com.tiacademy.nascimentos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class MatrizDTO implements Serializable {

    private Long id;
    private String obs;
    private String status;

}
