package com.vm.springbootsecurity.repositories;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vm.springbootsecurity.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);
}