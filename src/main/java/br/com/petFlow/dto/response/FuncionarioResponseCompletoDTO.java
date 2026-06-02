package br.com.petFlow.dto.response;

import java.math.BigDecimal;

public record FuncionarioResponseCompletoDTO(
        Long id,
        String nome,
        String cargo,
        String telefone,
        String email,
        BigDecimal salario )
{ }