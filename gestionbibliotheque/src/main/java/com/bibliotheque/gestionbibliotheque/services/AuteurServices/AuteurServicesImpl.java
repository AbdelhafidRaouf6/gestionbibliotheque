package com.bibliotheque.gestionbibliotheque.services.AuteurServices;

import com.bibliotheque.gestionbibliotheque.entities.Auteur;
import com.bibliotheque.gestionbibliotheque.repositories.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurServicesImpl implements AuteurServices {

    @Autowired
    AuteurRepository auteurRepository;
    @Override
    public Auteur createAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public Auteur updateAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public Auteur getAuteurById(Long idAuteur) {
        return auteurRepository.findById(idAuteur).get();
    }

    @Override
    public List<Auteur> getAllAuteur() {
        return auteurRepository.findAll();
    }

    @Override
    public void deleteAuteur(Long idAuteur) {
        auteurRepository.deleteById(idAuteur);
    }

    @Override
    public void deleteAllAuteur() {
        auteurRepository.deleteAll();
    }
}
