package com.bibliotheque.gestionbibliotheque.services.EmpruntServices;

import com.bibliotheque.gestionbibliotheque.entities.Emprunt;

import java.util.List;

public interface EmpruntServices {
    Emprunt createEmprunt(Emprunt emprunt);
    Emprunt updateEmprunt(Emprunt emprunt);
    Emprunt getEmpruntById(Long id);
    List<Emprunt> getAllEmprunt();
    void deleteEmprunt(Long id);
    void deleteAllEmprunt();
}
