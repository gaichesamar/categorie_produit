package com.samar.catproduit.repositories;

import com.samar.catproduit.entites.Categorie;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface CategorirRepository extends JpaRepository<Categorie,Long> {
}
