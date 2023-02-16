package com.projetoBackEnd.project.config;

import com.projetoBackEnd.project.entities.Order;
import com.projetoBackEnd.project.entities.User;
import com.projetoBackEnd.project.entities.enums.OrderStatus;
import com.projetoBackEnd.project.repositories.OrderRepository;
import com.projetoBackEnd.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2022-02-15T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2022-03-15T19:53:07Z"), OrderStatus.PAID,u2);
        Order o3 = new Order(null, Instant.parse("2022-05-15T21:53:22Z"), OrderStatus.PAID ,u1);

        repository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
