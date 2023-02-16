package com.projetoBackEnd.project.repositories;

import com.projetoBackEnd.project.entities.Category;
import com.projetoBackEnd.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
