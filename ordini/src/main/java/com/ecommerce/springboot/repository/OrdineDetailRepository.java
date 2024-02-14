package com.ecommerce.springboot.repository;

import com.ecommerce.springboot.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdineDetailRepository extends JpaRepository<OrderDetail, Long> {
}
