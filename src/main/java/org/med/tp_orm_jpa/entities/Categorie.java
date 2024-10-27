package org.med.tp_orm_jpa.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
@Entity
public class Categorie implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nomCategorie;
    @OneToMany(mappedBy="categorie",fetch=FetchType.LAZY)
    private Collection<Produit> produits;
    public Categorie(String nomCategorie) {
        super();
        this.nomCategorie = nomCategorie;
    }
    public Categorie() {
        super();
// TODO Auto-generated constructor stub
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomCategorie() {
        return nomCategorie;
    }
    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
    public Collection<Produit> getProduits() {
        return produits;
    }
    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
}