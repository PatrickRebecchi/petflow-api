package br.com.petFlow.dto.response;

public record ClienteResponseCompletoDTO(
        Long id,
        String nome,
        String cpf,
        String telefone,
        String email,
        String endereco
) {
}
