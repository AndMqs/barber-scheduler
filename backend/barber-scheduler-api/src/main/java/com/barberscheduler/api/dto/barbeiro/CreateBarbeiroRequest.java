package com.barberscheduler.api.dto.barbeiro;

public record CreateBarbeiroRequest(
        String nome,
        String telefone
) {

}
