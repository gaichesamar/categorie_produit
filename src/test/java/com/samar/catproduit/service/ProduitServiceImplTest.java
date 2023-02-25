package com.samar.catproduit.service;

import com.samar.catproduit.entites.Categorie;
import com.samar.catproduit.entites.Produit;
import com.samar.catproduit.repositories.ProduitRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProduitServiceImplTest {
    @Autowired
    private ProduitService service;
    @Autowired
    private ProduitRepository produitRepository;
    @Test
    public void testSaveProduitWithSuccess(){
   Produit produit = new Produit();
        assertNotNull(produit);
        assertNotNull(produit.getNamep());
        assertNotNull(produit.getDisponible());
        assertNotNull(produit.getDateCre());
        produit.setNamep(produit.getNamep());

    }


}