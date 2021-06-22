package com.vm.springbootsecurity.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vm.springbootsecurity.entity.Message;


public interface MessageRepository extends JpaRepository<Message, Integer>{

}