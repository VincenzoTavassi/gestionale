package com.ecommerce.springboot.serviceImpl;

import com.ecommerce.springboot.model.Product;
import com.ecommerce.springboot.repository.ProductsRepository;
import com.ecommerce.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsServiceImpl implements ProductService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Product> listaProdotti() {
        return productsRepository.findAll();
    }

    @Override
    public Product nuovoProdotto(Product product) {
        return productsRepository.save(product);
    }

    @Override
    public Product dettaglioProdottoById(int productId) {
        return productsRepository.findById(productId).orElse(null);
    }

    @Override
    public void aggTotaleProdottoById(Product prodottoAggiornato, int productId) {
        Optional<Product> pOptional = productsRepository.findById(productId);
        Product p = pOptional.get();
        p.setCategoryId(prodottoAggiornato.getCategoryId());
        p.setPrice(prodottoAggiornato.getPrice());
        p.setProductName(prodottoAggiornato.getProductName());
        p.setUnit(prodottoAggiornato.getUnit());

        productsRepository.save(p);
    }

    @Override
    public void aggParzialeProdottoById(int id) {

    }

    @Override
    public void eliminaProdottoById(int id) {
        productsRepository.deleteById(id);
    }
}
