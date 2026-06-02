package br.com.petFlow.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PetRequestDTO(
        @NotBlank(message = "Nome é obrigatório")
        String nome,
        @NotBlank(message = "Espécie é obrigatória")
        String especie,
        @NotBlank(message = "Raça é obrigatória")
        String raca,
        @NotNull(message = "Idade é obrigatória")
        Integer idade,
        @NotNull(message = "Peso é obrigatório")
        Double peso,
        @NotNull(message = "Cliente é obrigatório")
        Long clienteId
) {
}
