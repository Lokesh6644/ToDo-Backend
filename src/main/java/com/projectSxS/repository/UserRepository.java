package com.projectSxS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectSxS.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
