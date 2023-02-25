package com.samar.catproduit;

import com.samar.catproduit.entites.Categorie;
import com.samar.catproduit.repositories.CategorirRepository;
import com.samar.catproduit.service.CategorieService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CatproduitApplicationTests {
	@Autowired
private CategorieService categorieService;
	@Autowired
	private CategorirRepository categorirRepository;

	@Test
	void contextLoads() {

		Categorie expectedCategorie = Categorie.builder()
				.name("aaaa")
				.qt(1)
				.build();
		Categorie savedCategorie = categorieService.addcategorie(expectedCategorie);
		assertNotNull(savedCategorie);
		assertNotNull(expectedCategorie.getName() , savedCategorie.getName());
	}


}