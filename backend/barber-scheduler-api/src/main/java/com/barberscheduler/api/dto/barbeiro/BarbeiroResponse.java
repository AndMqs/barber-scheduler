package com.barberscheduler.api.dto.barbeiro;

public record BarbeiroResponse(
        Long id,
        String nome,
        String telefone,
        Boolean ativo
) {
}
