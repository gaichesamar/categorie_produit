package com.samar.catproduit.service;

import com.samar.catproduit.entites.produit;

import java.util.List;

public interface produitservice {
    public produit addproduit(produit produit , Long id);

    public List<produit> getproduits();

    public produit getproduitByid(Long id);

    public produit updateproduit(Long id , produit produit);

    public void deleteproduit(long id);

}
