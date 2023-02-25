package com.samar.catproduit.service;
import com.samar.catproduit.entites.Categorie;
import com.samar.catproduit.entites.Produit;
import com.samar.catproduit.repositories.CategorirRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class CategorieServiceImpl implements CategorieService{
    final private CategorirRepository CategorirRepository;




    public CategorieServiceImpl(com.samar.catproduit.repositories.CategorirRepository categorirRepository) {
        CategorirRepository = categorirRepository;
    }

    @Override
    public Categorie addcategorie(Categorie Categorie) {
        LocalDate date = LocalDate.now();
        Categorie.setDatecreation(date);
        Categorie.setDatemodif(date);
        return CategorirRepository.save(Categorie);
    }

    @Override
    public List<Categorie> getcategories() {

        return (List<Categorie>)  CategorirRepository.findAll();
    }

    @Override
    public Categorie getcategorieByid(long id) {
        return CategorirRepository.findById(id).get();
    }

    @Override
    public Categorie updatecategorie(long id, Categorie Categorie) {
        Categorie categorie1 = CategorirRepository.findById(id).get();
        categorie1.setName( Categorie.getName());
        categorie1.setQt( Categorie.getQt());
        categorie1.setDatecreation( Categorie.getDatecreation());
        categorie1.setDatemodif( Categorie.getDatemodif());
        return CategorirRepository.save(categorie1);
    }



    @Override
    public void deletecategorie(Long id) {
        CategorirRepository.deleteById(id);
    }
}
