package com.samar.catproduit.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int qt;
    private LocalDate datecreation;
    private LocalDate datemodif;
    @ManyToOne(targetEntity = produit.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "id-categorie",referencedColumnName = "id")
    private List<produit> produits;
}
