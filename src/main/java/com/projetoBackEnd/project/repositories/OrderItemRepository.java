package com.projetoBackEnd.project.repositories;

import com.projetoBackEnd.project.entities.OrderItem;
import com.projetoBackEnd.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
