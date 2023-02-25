package com.samar.catproduit.service;
import com.samar.catproduit.entites.Categorie;
import com.samar.catproduit.repositories.CategorirRepository;
import com.samar.catproduit.repositories.ProduitRepository;

import com.samar.catproduit.entites.Produit;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class ProduitServiceImpl implements ProduitService{
    final private  ProduitRepository produitRepository;
    private final com.samar.catproduit.repositories.CategorirRepository  categorirRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository, CategorirRepository categorirRepository) {
        this.produitRepository = produitRepository;
        this.categorirRepository = categorirRepository;
    }
    @Override
    public Produit addproduit(Produit produit,Long id ) {
        Categorie categorie = categorirRepository.findById(id).orElse(null);
        produit.setCategorie(categorie);
        LocalDate date = LocalDate.now();
        produit.setDate_cre(date);
        produit.setDate_mod(date);
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> getproduits() {


        return (List<Produit>) produitRepository.findAll();
    }


    @Override
    public Produit getproduitByid(Long id) {
        return produitRepository.findById(id).get();
    }


    @Override
    public Produit updateproduit(Long id, Produit Produit) {
        Produit produit1 = produitRepository.findById(id).get();
        produit1.setNamep(Produit.getNamep());
        produit1.setQt(Produit.getQt());
        produit1.setDisponible(Produit.getDisponible());
        produit1.setDate_cre(Produit.getDate_cre());
        produit1.setDate_mod(Produit.getDate_mod());
        return produitRepository.save(produit1);
    }

    @Override
    public void deleteproduit(long id) {
        produitRepository.deleteById(id);


    }



}