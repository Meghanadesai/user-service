package com.example.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user_service.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
