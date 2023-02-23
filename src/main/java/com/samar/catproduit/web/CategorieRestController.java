package com.samar.catproduit.web;
import com.samar.catproduit.entites.categorie;
import com.samar.catproduit.service.categorieservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200/")

public class CategorieRestController {
    @Autowired
    categorieservice categorieservice;
    @PostMapping("/add")
    public String addcategorie(@RequestBody categorie categorie){
        categorieservice.addcategorie(categorie);
        return "categorie a eté ajoutée avec succée...";
    }

    @GetMapping("/categories")
    public List<categorie> getcategories(){
        return categorieservice.getcategories();
    }

    @GetMapping("/categorie/{id}")
    public categorie getcategorieById(@PathVariable("id") Long id){
        return categorieservice.getcategorieByid(id);
    }

    @PutMapping("/update/{id}")
    public String updatecategorie(@PathVariable("id") long id, @RequestBody categorie categorie){
        categorieservice.updatecategorie(id, categorie);
        return "categorie a eté modifiée avec succée...";
    }

    @DeleteMapping("/delete/{id}")
    public String deletecategorie(@PathVariable("id") long id){
        categorieservice.deletecategorie(id);
        return "categorie a eté supprimée avec succée...";
    }
}
