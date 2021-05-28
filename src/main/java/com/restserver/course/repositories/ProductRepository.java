package com.restserver.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restserver.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
