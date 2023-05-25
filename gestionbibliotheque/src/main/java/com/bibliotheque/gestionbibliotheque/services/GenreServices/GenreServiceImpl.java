package com.bibliotheque.gestionbibliotheque.services.GenreServices;

import com.bibliotheque.gestionbibliotheque.entities.Genre;
import com.bibliotheque.gestionbibliotheque.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {
    @Autowired
    GenreRepository genreRepository;
    @Override
    public Genre createGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public Genre updateGenre(Genre genre) {
        return genreRepository.save(genre);
    }
    @Override
    public Genre getGenreById(Long idGenre) {
        return genreRepository.findById(idGenre).get();
    }
    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
    @Override
    public void deleteGenre(Long idGenre) {
        genreRepository.deleteById(idGenre);
    }

    @Override
    public void deleteAllGenre() {
        genreRepository.deleteAll();
    }

}
