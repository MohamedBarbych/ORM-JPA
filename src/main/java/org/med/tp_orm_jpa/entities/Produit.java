package org.med.tp_orm_jpa.entities;

import java.io.Serializable;
import javax.persistence.*;
import org.med.tp_orm_jpa.entities.Categorie;

@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(length=70)
    private String designation;
    private double prix;
    private int quantite;

    @ManyToOne
    @JoinColumn(name="ID_CAT")
    private Categorie categorie;

    public Produit() {
        super();
    }
    public Produit(String designation, double prix, int quantite,Categorie categorie) {
        super();
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
