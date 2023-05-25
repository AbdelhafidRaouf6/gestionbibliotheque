package com.bibliotheque.gestionbibliotheque.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Livre {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idLivre;
        private String titre;
        private float prix;
        private String resume;

        @Temporal(TemporalType.TIMESTAMP)
        private Date dateCreation;
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "auteur_id")
        private Auteur auteur;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "genre_id")
        private Genre genre;

        public Livre() {
        }
        public Livre(Long idLivre, String titre, float prix, String resume, Date dateCreation, Auteur auteur, Genre genre) {
            this.idLivre = idLivre;
            this.titre = titre;
            this.resume = resume;
            this.prix = prix;
            this.dateCreation= dateCreation;
            this.auteur = auteur;
            this.genre = genre;
        }
        @Override
        public String toString() {
            return "Livres{" +
                    "id=" + idLivre +
                    ", titre='" + titre + '\'' +
                    ", resume='" + resume + '\'' +
                    ", dateCreation=" + dateCreation +
                    ", prix=" + prix +
                    ", auteur=" + auteur +
                    ", genre=" + genre +
                    '}';
        }
        public Long getid() {
            return idLivre;
        }
        public void setid(Long idLivre) {
            this.idLivre = idLivre;
        }
        public String getTitre() {
            return titre;
        }
        public float getPrix() {
        return prix;
    }
        public void setPrix(float prix) {
        this.prix = prix;
    }
        public void setTitre(String titre) {
            this.titre = titre;
        }
        public Date getDateCreation() {
        return dateCreation;
        }
        public void setDateCreation(Date dateCreation) {this.dateCreation = dateCreation;}
        public String getResume() {
            return resume;
        }
        public void setResume(String resume) {
            this.resume = resume;
        }

        public Auteur getAuteur() {
            return auteur;
        }

        public void setAuteur(Auteur auteur) {
            this.auteur = auteur;
        }

        public Genre getGenre() {
            return genre;
        }

        public void setGenre(Genre genre) {
            this.genre = genre;
        }
}


