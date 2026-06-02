package br.com.petFlow.dto.request;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record FuncionarioRequestDTO(
        @NotBlank(message = "Nome é obrigatório")
        String nome,
        @NotBlank(message = "Cargo é obrigatório")
        String cargo,
        @NotBlank(message = "Telefone é obrigatório")
        String telefone,
        @Email(message = "Email inválido")
        @NotBlank(message = "Email é obrigatório")
        String email,
        @NotBlank(message = "Senha é obrigatória")
        @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
        String senha,
        @NotNull(message = "Salário é obrigatório")
        @Positive(message = "Salário deve ser maior que zero")
        BigDecimal salario
) {
}
