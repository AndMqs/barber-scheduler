package com.barberscheduler.api.entity;

import com.barberscheduler.api.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "barbeiros")
public class Barbeiro extends BaseEntity {

    @NotBlank
    @Column(nullable = false)
    private String nome;

    @NotBlank
    @Column(nullable = false)
    private String telefone;

    @NotNull
    @Column(nullable = false)
    private Boolean ativo = true;
}
