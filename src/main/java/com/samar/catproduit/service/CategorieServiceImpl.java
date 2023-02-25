package com.samar.catproduit.service;
import com.samar.catproduit.entites.Categorie;
import com.samar.catproduit.repositories.CategorirRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
@Service
public class CategorieServiceImpl implements CategorieService{
     private CategorirRepository categorirRepository;




    public CategorieServiceImpl(com.samar.catproduit.repositories.CategorirRepository categorirRepository) {
    }

    @Override
    public Categorie addcategorie(Categorie categorie) {
        LocalDate date = LocalDate.now();
        categorie.setDatecreation(date);
        categorie.setDatemodif(date);
        return categorirRepository.save(categorie);
    }

    @Override
    public List<Categorie> getcategories() {

        return   categorirRepository.findAll();
    }

    @Override
    public Categorie getcategorieByid(long id) {
        return categorirRepository.findById(id).orElse(null);
    }

    @Override
    public Categorie updatecategorie(long id, Categorie categorie) {
        categorie.setQt( categorie.getQt());
        categorie.setDatecreation( categorie.getDatecreation());
        categorie.setDatemodif( categorie.getDatemodif());
        return categorirRepository.save(categorie);
    }



    @Override
    public void deletecategorie(Long id) {
        categorirRepository.deleteById(id);
    }
}
