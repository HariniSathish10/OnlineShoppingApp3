package com.example.onlineshoppingapp.controller;

import com.example.onlineshoppingapp.model.Product;
import com.example.onlineshoppingapp.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("products",
                service.getAllProducts());

        model.addAttribute("product",
                new Product());

        return "index";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute Product product) {

        service.saveProduct(product);

        return "redirect:/";
    }
}