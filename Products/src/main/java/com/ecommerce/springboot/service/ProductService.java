package com.ecommerce.springboot.service;

import com.ecommerce.springboot.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ProductService {

    List<Product> listaProdotti();
    Product nuovoProdotto(Product product);
    Product dettaglioProdottoById(int id);
    Product aggTotaleProdottoById(Product product, int id);
    ResponseEntity<Product> aggParzialeProdottoById(int id, Map<String, Object> aggiornamenti);
    void eliminaProdottoById(int id);

}
