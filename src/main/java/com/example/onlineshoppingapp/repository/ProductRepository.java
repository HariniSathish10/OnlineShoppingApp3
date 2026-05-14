package com.example.onlineshoppingapp.repository;

import com.example.onlineshoppingapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}