package org.med.tp_orm_jpa;


import org.med.tp_orm_jpa.dao.EntityRepository;
import org.med.tp_orm_jpa.entities.Categorie;
import org.med.tp_orm_jpa.entities.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TpOrmJpaApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TpOrmJpaApplication.class, args);
        EntityRepository produitDao = ctx.getBean(EntityRepository.class);

        // Example Categorie initialization (ensure you have a proper Categorie object)
        Categorie categorie = new Categorie(); // Create or retrieve your Categorie object

        produitDao.save(new Produit("Imprimante HP", 1500, 5, categorie));
        produitDao.save(new Produit("Laptop Dell", 3000, 10, categorie));

        // Use the findByDesignation method correctly
        produitDao.findByDesignation("Imprimante HP").forEach(produit -> {
            // Ensure 'produit' is of type 'Produit'
            System.out.println(((Produit) produit).getDesignation());
        });
    }
}
