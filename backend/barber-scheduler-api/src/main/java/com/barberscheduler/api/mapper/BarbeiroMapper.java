package com.barberscheduler.api.mapper;

import com.barberscheduler.api.dto.barbeiro.BarbeiroResponse;
import com.barberscheduler.api.dto.barbeiro.CreateBarbeiroRequest;
import com.barberscheduler.api.entity.Barbeiro;
import org.springframework.stereotype.Component;

@Component
public class BarbeiroMapper {

    public Barbeiro toEntity(CreateBarbeiroRequest request){
        Barbeiro barbeiro = new Barbeiro();
        barbeiro.setNome(request.nome());
        barbeiro.setTelefone(request.telefone());
        return barbeiro;
    }

    public BarbeiroResponse toResponse(Barbeiro barbeiro){
        return new BarbeiroResponse(
                barbeiro.getId(),
                barbeiro.getNome(),
                barbeiro.getTelefone(),
                barbeiro.getAtivo()
        );
    }

}
