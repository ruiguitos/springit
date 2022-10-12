package com.vega.springit.repository;

import com.vega.springit.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);


    ///////////////////////////////////////14.10/////////////////////////////////////
    Optional<User> findByEmailAndActivationCode(String email, String activationCode);
}
