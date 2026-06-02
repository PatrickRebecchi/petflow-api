package br.com.petFlow.dto.response;

public record PetResponseSimplesDTO(
        Long id,
        String nome,
        Long clienteId
) {
}
