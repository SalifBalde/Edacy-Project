package com.fouladouhitech.demoedacy.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String auteur;
    private String description;

    // Constructeur par défaut
    public Livre() {
    }

    // Constructeur avec tous les champs
    public Livre(Long id, String titre, String auteur, String description) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.description = description;
    }

    // Constructeur sans l'id
    public Livre(String titre, String auteur, String description) {
        this.titre = titre;
        this.auteur = auteur;
        this.description = description;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
