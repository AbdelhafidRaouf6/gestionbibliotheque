package com.bibliotheque.gestionbibliotheque.services.LivreServices;

import com.bibliotheque.gestionbibliotheque.entities.Livre;

import java.util.List;
    public interface LivreServices {
        Livre createLivre(Livre livre);
        Livre updateLivre(Livre livre);
        Livre getLivreById(Long id) ;
        List<Livre> getAllLivres();
        void deleteLivre(Long id);
        void deleteAllLivres();


    }


