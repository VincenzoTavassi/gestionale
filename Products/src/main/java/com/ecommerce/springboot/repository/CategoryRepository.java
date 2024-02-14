package com.ecommerce.springboot.repository;

import com.ecommerce.springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Product, Integer> {
}
