package com.samar.catproduit.service;
import com.samar.catproduit.entites.categorie;
import com.samar.catproduit.repositories.categorirRepository;
import com.samar.catproduit.repositories.ProduitRepository;

import com.samar.catproduit.entites.produit;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class produitserviceImpl implements produitservice{
    final private  ProduitRepository produitRepository;
    private final com.samar.catproduit.repositories.categorirRepository categorirRepository;

    public produitserviceImpl(ProduitRepository produitRepository,
                              categorirRepository categorirRepository) {
        this.produitRepository = produitRepository;
        this.categorirRepository = categorirRepository;
    }
    @Override
    public produit addproduit(produit produit,Long id ) {
        categorie categorie = categorirRepository.findById(id).orElse(null);
        produit.setCategorie(categorie);
        LocalDate date = LocalDate.now();
        produit.setDate_cre(date);
        produit.setDate_mod(date);
        return produitRepository.save(produit);
    }

    @Override
    public List<produit> getproduits() {


            return (List<produit>) produitRepository.findAll();
        }


    @Override
    public produit getproduitByid(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public produit updateproduit(Long id, produit produit) {
        produit produit1 = produitRepository.findById(id).get();
        produit1.setNamep(produit.getNamep());
        produit1.setQt(produit.getQt());
        produit1.setDisponible(produit.getDisponible());
        produit1.setDate_cre(produit.getDate_cre());
        produit1.setDate_mod(produit.getDate_mod());
        return produitRepository.save(produit1);
    }

    @Override
    public void deleteproduit(long id) {
        produitRepository.deleteById(id);


    }



}
