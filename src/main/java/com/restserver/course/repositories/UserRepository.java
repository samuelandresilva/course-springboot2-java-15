package com.restserver.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restserver.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
