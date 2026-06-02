package br.com.petFlow.dto.response;

import java.math.BigDecimal;

public record FuncionarioResponseSimplesDTO(
        Long id,
        String nome,
        String cargo) {
}
