package com.rohan.springboot.reactivemongo.repos;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.rohan.springboot.reactivemongo.collections.Product;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

}
