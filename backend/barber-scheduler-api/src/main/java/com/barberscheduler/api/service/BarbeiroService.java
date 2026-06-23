package com.barberscheduler.api.service;

import com.barberscheduler.api.dto.barbeiro.CreateBarbeiroRequest;
import com.barberscheduler.api.entity.Barbeiro;
import com.barberscheduler.api.repository.BarbeiroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BarbeiroService {

    private final BarbeiroRepository repository;

    public Barbeiro criar(Barbeiro barbeiro){
        return repository.save(barbeiro);
    }

    public List<Barbeiro> listarTodos(){
        return repository.findAll();
    }
}
