package com.bibliotheque.gestionbibliotheque.repositories;

import com.bibliotheque.gestionbibliotheque.entities.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {

}

