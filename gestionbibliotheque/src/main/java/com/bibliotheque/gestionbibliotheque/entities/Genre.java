package com.bibliotheque.gestionbibliotheque.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenre;
    private String nom;
    @OneToMany(mappedBy = "genre")
    private List<Livre> livres;
    public Genre(){
        // Constructeur par défaut sans arguments

    }
    public Genre(Long idGenre, String nom, List<Livre> livres) {
        this.idGenre = idGenre;
        this.nom = nom;
        this.livres = livres;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + idGenre +
                ", nom='" + nom + '\'' +
                ", livres=" + livres +
                '}';
    }
    public Long getId() {
        return idGenre;
    }

    public void setId(Long idGenre) {
        this.idGenre = idGenre;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public List<Livre> getLivres() {
        return livres;
    }
    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }
}

