package com.restserver.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restserver.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
