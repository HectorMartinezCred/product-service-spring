package com.hector.udemy.productservicespring.models.service;

import java.util.List;

import com.hector.udemy.productservicespring.models.entity.Product;

public interface ProductService {
    
    public List<Product> findAll();
    public Product findById(Long id);

}
