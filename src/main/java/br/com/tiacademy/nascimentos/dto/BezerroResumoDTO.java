package br.com.tiacademy.nascimentos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BezerroResumoDTO  implements Serializable {
    private Long id;
    private String status;
    private LocalDate dataNasc;
    private String sexo;
    private String registro;
}
