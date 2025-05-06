package com.fouladouhitech.demoedacy.repository;

import com.fouladouhitech.demoedacy.models.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livre, Long> {

}
