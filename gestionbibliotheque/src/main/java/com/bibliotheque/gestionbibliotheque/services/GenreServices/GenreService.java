package com.bibliotheque.gestionbibliotheque.services.GenreServices;

import com.bibliotheque.gestionbibliotheque.entities.Genre;

import java.util.List;

public interface GenreService {

    Genre createGenre(Genre genre);
    Genre updateGenre(Genre genre);
    Genre getGenreById(Long id);
    List<Genre> getAllGenres();
    void deleteGenre(Long id);
    void deleteAllGenre();

}

