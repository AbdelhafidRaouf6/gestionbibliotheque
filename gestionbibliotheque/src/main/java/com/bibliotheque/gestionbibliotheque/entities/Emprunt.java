package com.bibliotheque.gestionbibliotheque.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

    @Entity
    public class Emprunt {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private LocalDate dateEmprunt;
        private LocalDate dateRetour;


        public Emprunt(Long id, LocalDate dateEmprunt, LocalDate dateRetour) {
            this.id = id;
            this.dateEmprunt = dateEmprunt;
            this.dateRetour = dateRetour;
        }

        @Override
        public String toString() {
            return "Emprunt{" +
                    "id=" + id +
                    ", dateEmprunt=" + dateEmprunt +
                    ", dateRetour=" + dateRetour +
                    '}';
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public LocalDate getDateEmprunt() {
            return dateEmprunt;
        }

        public void setDateEmprunt(LocalDate dateEmprunt) {
            this.dateEmprunt = dateEmprunt;
        }

        public LocalDate getDateRetour() {
            return dateRetour;
        }

        public void setDateRetour(LocalDate dateRetour) {
            this.dateRetour = dateRetour;
        }

    }


