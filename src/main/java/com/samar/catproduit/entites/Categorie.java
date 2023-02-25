package com.samar.catproduit.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int qt;
    private LocalDate datecreation;
    private LocalDate datemodif;
    @OneToMany(mappedBy = "categorie")
    private List<Produit> produits=new ArrayList<>();
}
