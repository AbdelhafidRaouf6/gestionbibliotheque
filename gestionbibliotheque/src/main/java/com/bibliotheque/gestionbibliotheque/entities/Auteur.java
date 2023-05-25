package com.bibliotheque.gestionbibliotheque.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuteur;
    private String nom;
    private String prenom;
    private Date dateNaissance;

    @OneToMany(mappedBy = "auteur")
    private List<Livre> livres;
    public Auteur(){

    }

    public Auteur(Long idAuteur, String nom, String prenom, Date dateNaissance, List<Livre> livres) {
        this.idAuteur = idAuteur;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.livres = livres;
    }
    @Override
    public String toString() {
        return "Auteur{" +
                "id=" + idAuteur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", livres=" + livres +
                '}';
    }

    public Long getId() {
        return idAuteur;
    }

    public void setId(Long idAuteur) {
        this.idAuteur = idAuteur;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }
}
