package com.hector.udemy.productservicespring.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.hector.udemy.productservicespring.models.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
