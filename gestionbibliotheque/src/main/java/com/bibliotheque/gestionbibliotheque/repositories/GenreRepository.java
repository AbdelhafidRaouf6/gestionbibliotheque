package com.bibliotheque.gestionbibliotheque.repositories;

import com.bibliotheque.gestionbibliotheque.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}

