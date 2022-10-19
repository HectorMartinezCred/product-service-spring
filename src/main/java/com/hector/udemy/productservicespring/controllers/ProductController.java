package com.hector.udemy.productservicespring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hector.udemy.productservicespring.models.entity.Product;
import com.hector.udemy.productservicespring.models.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public List<Product> list(){
        return productService.findAll();
    }
    
    @GetMapping("/detail/{id}")
    public Product detail(@PathVariable Long id){
        return productService.findById(id);
    }
}
