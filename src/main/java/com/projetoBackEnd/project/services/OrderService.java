package com.projetoBackEnd.project.services;

import com.projetoBackEnd.project.entities.Order;
import com.projetoBackEnd.project.entities.User;
import com.projetoBackEnd.project.repositories.OrderRepository;
import com.projetoBackEnd.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
