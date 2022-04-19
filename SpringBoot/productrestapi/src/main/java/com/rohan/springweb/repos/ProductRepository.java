package com.rohan.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohan.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
