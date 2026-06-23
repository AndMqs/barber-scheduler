package com.barberscheduler.api.entity;

import com.barberscheduler.api.entity.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "servicos")
@Getter
@Setter
@NoArgsConstructor
public class Servico extends BaseEntity {

    @NotBlank
    @Column(nullable = false)
    private String nome;

    @NotNull
    @Positive
    @Column(nullable = false)
    private Integer duracaoEmMinutos;

    @NotNull
    @Positive
    @Column(nullable = false)
    private BigDecimal preco;

    @NotNull
    @Column(nullable = false)
    private Boolean ativo = true;
}
