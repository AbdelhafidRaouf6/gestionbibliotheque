package com.bibliotheque.gestionbibliotheque.services.LivreServices;

import com.bibliotheque.gestionbibliotheque.entities.Livre;
import com.bibliotheque.gestionbibliotheque.repositories.GenreRepository;
import com.bibliotheque.gestionbibliotheque.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreServiceImpl implements LivreServices {
    @Autowired
    LivreRepository livreRepository;
    GenreRepository genreRepository;

    @Override
    public Livre createLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public Livre updateLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public Livre getLivreById(Long idLivre){
        return livreRepository.findById(idLivre).get();
    }

    @Override
    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    @Override
    public void deleteLivre(Long idLivre) {
        livreRepository.deleteById(idLivre);
    }

    @Override
    public void deleteAllLivres() {
        livreRepository.deleteAll();
    }


}


