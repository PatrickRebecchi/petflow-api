package br.com.petFlow.dto.response;

public record PetResponseCompletoDTO(
        Long id,
        String nome,
        String especie,
        String raca,
        Integer idade,
        Double peso,
        Long clienteId
) {
}
