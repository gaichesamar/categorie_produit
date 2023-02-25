package com.samar.catproduit.service;

import com.samar.catproduit.entites.Produit;

import java.util.List;

public interface ProduitService {
    public Produit addproduit(Produit produit , Long id);

    public List<Produit> getproduits();

    public Produit getproduitByid(Long id);

    public Produit updateproduit(Long id , Produit produit);

    public void deleteproduit(long id);

}
