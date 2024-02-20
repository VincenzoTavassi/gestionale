package com.ecommerce.springboot.controller;

import com.ecommerce.springboot.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriesController {

    ProductService productService;

    public CategoriesController(ProductService productService) {
        super();
        this.productService = productService;
    }



}
