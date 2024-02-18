package com.ecommerce.springboot.service;

import com.ecommerce.springboot.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> listaProdotti();
    Product nuovoProdotto(Product product);
    Product dettaglioProdottoById(int id);
    void aggTotaleProdottoById(Product product, int id);
    void aggParzialeProdottoById(int id);
    void eliminaProdottoById(int id);

}
