package com.bibliotheque.gestionbibliotheque.services.EmpruntServices;

import com.bibliotheque.gestionbibliotheque.entities.Emprunt;
import com.bibliotheque.gestionbibliotheque.repositories.EmpruntRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpruntServicesImpl implements EmpruntServices {

    @Autowired
    EmpruntRepository empruntRepository;
    @Override
    public Emprunt createEmprunt(Emprunt emprunt) {
        return empruntRepository.save(emprunt);
    }

    @Override
    public Emprunt updateEmprunt(Emprunt emprunt) {
        return empruntRepository.save(emprunt);
    }

    @Override
    public Emprunt getEmpruntById(Long id) {
        return empruntRepository.findById(id).get();
    }

    @Override
    public List<Emprunt> getAllEmprunt() {
        return empruntRepository.findAll();
    }

    @Override
    public void deleteEmprunt(Long id) {
        empruntRepository.deleteById(id);
    }

    @Override
    public void deleteAllEmprunt() {
        empruntRepository.deleteAll();
    }
}
