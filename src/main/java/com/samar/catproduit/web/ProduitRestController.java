package com.samar.catproduit.web;
import com.samar.catproduit.entites.Produit;
import com.samar.catproduit.service.CategorieService;
import com.samar.catproduit.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ProduitRestController {
    @Autowired
    private ProduitService produitservice;
    @Autowired
    private CategorieService categorieservice;

    @PostMapping("/produitsave/{id}")
    public String  addproduit(@RequestBody Produit Produit, @PathVariable long id){
        produitservice.addproduit(Produit,id);
        return "produit a eté ajoutée avec succée...";

    }
    @GetMapping("/produits")
    public List<Produit> getproduits(){
        return produitservice.getproduits();
    }
@GetMapping("/produit/{id}")
    Produit getproduitByid(@PathVariable Long id){

        return this.produitservice.getproduitByid(id);
}
    @PutMapping("/updateproduit/{id}")
    public String updateproduit(@PathVariable("id") long id, @RequestBody Produit produit){
        produitservice.updateproduit(id, produit);
        return "produit a eté modifiée avec succée...";
    }

    @DeleteMapping("/deleteproduit/{id}")
    public String deleteproduit(@PathVariable("id") long id){
        produitservice.deleteproduit(id);
        return "produit a eté supprimée avec succée...";
    }

}
