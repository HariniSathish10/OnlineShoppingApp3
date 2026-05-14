package com.example.shoppingapp.service;

import com.example.shoppingapp.model.Product;
import com.example.shoppingapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // 1. Save Product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // 2. Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // 3. Get product by id
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // 4. Delete product
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}