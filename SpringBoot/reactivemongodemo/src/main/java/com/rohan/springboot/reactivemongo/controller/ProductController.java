package com.rohan.springboot.reactivemongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohan.springboot.reactivemongo.collections.Product;
import com.rohan.springboot.reactivemongo.repos.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository repo;

	@PostMapping
	public Mono<Product> addProduct(@RequestBody Product product) {
		return repo.save(product).log();
	}

	@GetMapping
	public Flux<Product> getProducts() {
		return repo.findAll().log();
	}
	
	@GetMapping("{id}")
	public Mono<Product> getProduct(@PathVariable("id") String id){
		return repo.findById(id).log();
	}

}
