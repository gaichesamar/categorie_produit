package com.samar.catproduit.service;

import com.samar.catproduit.entites.categorie;

import java.util.List;

public interface categorieservice {
    public categorie addcategorie(categorie categorie);

    public List<categorie> getcategories();

    public categorie getcategorieByid(long id);

    public categorie updatecategorie (long id , categorie categorie);

    public void deletecategorie(Long id);
}
