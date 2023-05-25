package com.bibliotheque.gestionbibliotheque.repositories;

import com.bibliotheque.gestionbibliotheque.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {

}

