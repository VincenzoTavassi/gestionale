package com.ecommerce.springboot.controller;

import com.ecommerce.springboot.model.Product;
import com.ecommerce.springboot.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductsController {

    ProductService productService;

    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }

    @GetMapping
    public List<Product> listaProdotti(){
        return productService.listaProdotti();
    }

    @PostMapping
    public Product nuovoProdotto(@RequestBody Product product){
        return productService.nuovoProdotto(product);
    }

    @GetMapping("/{id}")
    public Product dettaglioProdottoById(@PathVariable int id){
        return productService.dettaglioProdottoById(id);
    }

    @PutMapping("/{id}")
    public Product aggTotaleProdottoById(@RequestBody Product updatedProduct, @PathVariable int id){
        return productService.aggTotaleProdottoById(updatedProduct, id);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Product> aggParzialeProdottoById(@PathVariable int id,
                                                           @RequestBody Map<String, Object> aggiornamenti){
        return productService.aggParzialeProdottoById(id, aggiornamenti);
    }

    @DeleteMapping("/{id}")
    public void eliminaProdottoById(@PathVariable int id){
        productService.eliminaProdottoById(id);
    }

}
