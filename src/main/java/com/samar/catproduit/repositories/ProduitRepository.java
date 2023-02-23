package com.samar.catproduit.repositories;

import com.samar.catproduit.entites.produit;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface ProduitRepository extends JpaRepository<produit,Long> {
}
