package com.samar.catproduit.web;
import com.samar.catproduit.entites.produit;
import com.samar.catproduit.service.produitservice;
import com.samar.catproduit.service.categorieservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class produitRestController {
    @Autowired
    private produitservice produitservice;
    @Autowired
    private categorieservice categorieservice;

    @PostMapping("/produitsave/{id}")
    public String  addproduit(@RequestBody produit produit, @PathVariable long id){
        produitservice.addproduit(produit,id);
        return "produit a eté ajoutée avec succée...";

    }
    @GetMapping("/produits")
    public List<produit> getproduits(){
        return produitservice.getproduits();
    }
@GetMapping("/produit/{id}")
    produit getproduitByid(@PathVariable Long id){
        return this.produitservice.getproduitByid(id);
}
    @PutMapping("/updateproduit/{id}")
    public String updateproduit(@PathVariable("id") long id, @RequestBody produit produit){
        produitservice.updateproduit(id, produit);
        return "produit a eté modifiée avec succée...";
    }

    @DeleteMapping("/deleteproduit/{id}")
    public String deleteproduit(@PathVariable("id") long id){
        produitservice.deleteproduit(id);
        return "produit a eté supprimée avec succée...";
    }

}
