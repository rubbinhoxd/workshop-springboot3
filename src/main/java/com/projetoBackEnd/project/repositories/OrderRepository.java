package com.projetoBackEnd.project.repositories;

import com.projetoBackEnd.project.entities.Order;
import com.projetoBackEnd.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
