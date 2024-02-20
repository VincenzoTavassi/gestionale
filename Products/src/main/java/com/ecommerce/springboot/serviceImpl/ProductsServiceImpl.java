package com.ecommerce.springboot.serviceImpl;

import com.ecommerce.springboot.model.Product;
import com.ecommerce.springboot.repository.ProductsRepository;
import com.ecommerce.springboot.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ProductsServiceImpl implements ProductService {

    ProductsRepository productsRepo;

    public ProductsServiceImpl(ProductsRepository productsRepo) {
        this.productsRepo = productsRepo;
    }

    @Override
    public List<Product> listaProdotti() {
        return productsRepo.findAll();
    }

    @Override
    public Product nuovoProdotto(Product product) {
        return productsRepo.save(product);
    }

    @Override
    public Product dettaglioProdottoById(int productId) {
        return productsRepo.findById(productId).orElse(null);
    }

    @Override
    public Product aggTotaleProdottoById(Product prodottoAggiornato, int productId) {
        Optional<Product> pOptional = productsRepo.findById(productId);
        Product p = pOptional.get();
        p.setCategoryId(prodottoAggiornato.getCategoryId());
        p.setPrice(prodottoAggiornato.getPrice());
        p.setProductName(prodottoAggiornato.getProductName());
        p.setUnit(prodottoAggiornato.getUnit());

        return productsRepo.save(p);
    }

    @Override
    public ResponseEntity<Product> aggParzialeProdottoById(int id, Map<String, Object> aggiornamenti) {
        Optional<Product> optionalProduct = productsRepo.findById(id);

        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();

            for (Map.Entry<String, Object> entry : aggiornamenti.entrySet()) {
                switch (entry.getKey()) {
                    case "productName":
                        product.setProductName((String) entry.getValue());
                        break;
                    case "categoryId":
                        product.setCategoryId((Integer) entry.getValue());
                        break;
                    case "unit":
                        product.setUnit((String) entry.getValue());
                        break;
                    case "price":
                        product.setPrice((Double) entry.getValue());
                        break;
                }
            }

            productsRepo.save(product);

            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void eliminaProdottoById(int id) {
        productsRepo.deleteById(id);
    }
}
