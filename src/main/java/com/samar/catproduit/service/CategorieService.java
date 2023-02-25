package com.samar.catproduit.service;

import com.samar.catproduit.entites.Categorie;

import java.util.List;

public interface CategorieService {
    public Categorie addcategorie(Categorie categorie);



    public List<Categorie> getcategories();

    public Categorie getcategorieByid(long id);

    public Categorie updatecategorie (long id , Categorie categorie);

    public void deletecategorie(Long id);
}
