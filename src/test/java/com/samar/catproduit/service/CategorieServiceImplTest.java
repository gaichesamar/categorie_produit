package com.samar.catproduit.service;

import com.samar.catproduit.entites.Categorie;
import com.samar.catproduit.repositories.CategorirRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class CategorieServiceImplTest {
    @Autowired
    private CategorieService service;
    @Autowired
    private CategorirRepository categorirRepository;

    @Test
    public void shouldSaveCategorieWithSuccess(){
        Categorie expectedCategorie = null;
        Categorie savedCategorie = service.addcategorie(expectedCategorie);
        assertNotNull(savedCategorie);
        assertNotNull(savedCategorie.getId());
        assertNotNull(savedCategorie.getName());
        assertNotNull(savedCategorie.getDatecreation());
        assertNotNull(savedCategorie.getDatemodif());
    }

}