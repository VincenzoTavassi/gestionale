package com.ecommerce.springboot.repository;

import com.ecommerce.springboot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdineRepository extends JpaRepository<Order, Long> {

}
