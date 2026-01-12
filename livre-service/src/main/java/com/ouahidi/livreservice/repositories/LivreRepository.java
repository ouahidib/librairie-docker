package com.ouahidi.livreservice.repositories;

import com.ouahidi.livreservice.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository  extends JpaRepository<Livre, Long> {
}
