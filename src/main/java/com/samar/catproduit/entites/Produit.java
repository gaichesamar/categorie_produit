package com.samar.catproduit.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namep;
    private int qt;
    private Boolean disponible;
    private LocalDate dateCre;
    private LocalDate dateMod;
    @ManyToOne
private  Categorie categorie;
}
