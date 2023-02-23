package com.samar.catproduit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.samar.catproduit")
public class CatproduitApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatproduitApplication.class, args);
	}

}
