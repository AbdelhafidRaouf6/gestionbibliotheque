package com.bibliotheque.gestionbibliotheque.repositories;

import com.bibliotheque.gestionbibliotheque.entities.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur, Long> {

}
