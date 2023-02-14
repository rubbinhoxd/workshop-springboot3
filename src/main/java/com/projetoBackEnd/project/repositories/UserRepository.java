package com.projetoBackEnd.project.repositories;

import com.projetoBackEnd.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
