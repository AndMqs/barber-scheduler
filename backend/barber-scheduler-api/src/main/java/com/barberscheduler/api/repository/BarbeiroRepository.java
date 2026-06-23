package com.barberscheduler.api.repository;

import com.barberscheduler.api.entity.Barbeiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarbeiroRepository extends JpaRepository<Barbeiro, Long> {
}
