package com.ecommerce.springboot.repository;

import com.ecommerce.springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
