package com.projetoBackEnd.project.services;

import com.projetoBackEnd.project.entities.User;
import com.projetoBackEnd.project.repositories.UserRepository;
import com.projetoBackEnd.project.services.exceptions.DatabaseException;
import com.projetoBackEnd.project.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User insertUser(User obj){
        return repository.save(obj);
    }
    public List<User> findAll(){
        return repository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
    public User updateUser(Long id, User obj){
        try {
            User entity = repository.getReferenceById(id); //referencia, mas so deixa o obj monitorado, ou seja, nao vai ao banco
            updateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }

    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

    public void deleteUserById(Long id){
        try{
            repository.deleteById(id);
        } catch(EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }

    }

}
