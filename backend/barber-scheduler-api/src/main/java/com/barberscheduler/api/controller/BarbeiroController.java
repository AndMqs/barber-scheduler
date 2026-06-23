package com.barberscheduler.api.controller;

import com.barberscheduler.api.dto.barbeiro.BarbeiroResponse;
import com.barberscheduler.api.dto.barbeiro.CreateBarbeiroRequest;
import com.barberscheduler.api.entity.Barbeiro;
import com.barberscheduler.api.mapper.BarbeiroMapper;
import com.barberscheduler.api.service.BarbeiroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barbeiro")
@RequiredArgsConstructor
public class BarbeiroController {

    private final BarbeiroService barbeiroService;
    private final BarbeiroMapper mapper;

    @PostMapping
    public ResponseEntity<BarbeiroResponse> criarBarbeiro(@RequestBody CreateBarbeiroRequest request){
        Barbeiro barbeiro = mapper.toEntity(request);
        Barbeiro barbeiroSalvo = barbeiroService.criar(barbeiro);
        BarbeiroResponse response = mapper.toResponse(barbeiroSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<BarbeiroResponse>> buscarTodos(){
        List <BarbeiroResponse> response = barbeiroService.listarTodos()
                .stream()
                .map(mapper::toResponse)
                .toList();
        return ResponseEntity.ok(response);
    }

}
