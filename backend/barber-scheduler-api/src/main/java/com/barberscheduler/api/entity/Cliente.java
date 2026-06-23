package com.barberscheduler.api.entity;

import com.barberscheduler.api.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente extends BaseEntity {

    @NotBlank
    @Column(nullable = false)
    private String nome;

    @NotBlank
    @Column(nullable = false)
    private String telefone;


    @NotBlank
    @Email
    @Column(nullable = false)
    private String email;

}
