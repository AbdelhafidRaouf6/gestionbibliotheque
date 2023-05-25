package com.bibliotheque.gestionbibliotheque.services.AuteurServices;

import com.bibliotheque.gestionbibliotheque.entities.Auteur;
import com.bibliotheque.gestionbibliotheque.entities.Genre;

import java.util.List;

public interface AuteurServices {
    Auteur createAuteur(Auteur auteur);
    Auteur updateAuteur(Auteur auteur);
    Auteur getAuteurById(Long id);
    List<Auteur> getAllAuteur();
    void deleteAuteur(Long id);
    void deleteAllAuteur();

    }
