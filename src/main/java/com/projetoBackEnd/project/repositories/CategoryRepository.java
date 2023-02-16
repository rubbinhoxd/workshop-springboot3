package com.projetoBackEnd.project.repositories;

import com.projetoBackEnd.project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
