package com.ouahidi.empruntservice.repositories;

import com.ouahidi.empruntservice.entities.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpruntRepository extends
        JpaRepository<Emprunt, Long> {
}
