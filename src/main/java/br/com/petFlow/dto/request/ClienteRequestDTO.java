package br.com.petFlow.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ClienteRequestDTO(
        @NotBlank(message = "Nome é obrigatório")
        String nome,
        @NotBlank(message = "CPF é obrigatório")
        String cpf,
        @NotBlank(message = "Telefone é obrigatório")
        String telefone,
        @Email(message = "Email inválido")
        @NotBlank(message = "Email é obrigatório")
        String email,
        @NotBlank(message = "Senha é obrigatória")
        @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
        String senha,
        @NotBlank(message = "Endereço é obrigatório")
        String endereco ) {
}
