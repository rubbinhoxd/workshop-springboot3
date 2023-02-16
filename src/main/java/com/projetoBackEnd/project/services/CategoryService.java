package com.projetoBackEnd.project.services;

import com.projetoBackEnd.project.entities.Category;
import com.projetoBackEnd.project.entities.User;
import com.projetoBackEnd.project.repositories.CategoryRepository;
import com.projetoBackEnd.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
