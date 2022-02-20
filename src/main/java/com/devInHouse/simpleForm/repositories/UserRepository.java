package com.devInHouse.simpleForm.repositories;

import com.devInHouse.simpleForm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Criando uma instancia do JpaRepository
     * Acessa os dados da entidade User
     */
}
