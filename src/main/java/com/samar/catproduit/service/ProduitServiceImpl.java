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
    private final   ProduitRepository produitRepository;
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
        produit.setDateCre(date);
        produit.setDateMod(date);
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> getproduits() {


        return  produitRepository.findAll();
    }


    @Override
    public Produit getproduitByid(Long id) {
        return produitRepository.findById(id).orElse(null);
    }


    @Override
    public Produit updateproduit(Long id, Produit produit) {
        produit.setNamep(produit.getNamep());
        produit.setQt(produit.getQt());
        produit.setDisponible(produit.getDisponible());
        produit.setDateCre(produit.getDateCre());
        produit.setDateMod(produit.getDateMod());
        return produitRepository.save(produit);
    }

    @Override
    public void deleteproduit(long id) {
        produitRepository.deleteById(id);


    }



}