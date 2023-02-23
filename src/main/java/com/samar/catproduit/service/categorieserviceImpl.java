package com.samar.catproduit.service;
import com.samar.catproduit.repositories.categorirRepository;

import com.samar.catproduit.entites.categorie;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class categorieserviceImpl implements categorieservice{
final private categorirRepository categorieRepository;

    public categorieserviceImpl(categorirRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }
    @Override
    public categorie addcategorie(categorie categorie) {
        LocalDate date = LocalDate.now();
        categorie.setDatecreation(date);
        categorie.setDatemodif(date);
        return categorieRepository.save(categorie);
    }

    @Override
    public List<categorie> getcategories() {
        return (List<categorie>) categorieRepository.findAll();
    }

    @Override
    public categorie getcategorieByid(long id) {
        return categorieRepository.findById(id).get();
    }

    @Override
    public categorie updatecategorie(long id, categorie categorie) {
        categorie categorie1 = categorieRepository.findById(id).get();
        categorie1.setName(categorie.getName());
        categorie1.setQt(categorie.getQt());
        categorie1.setDatecreation(categorie.getDatecreation());
        categorie1.setDatemodif(categorie.getDatemodif());
        return categorieRepository.save(categorie1);
    }



    @Override
    public void deletecategorie(Long id) {
        categorieRepository.deleteById(id);
    }
}
