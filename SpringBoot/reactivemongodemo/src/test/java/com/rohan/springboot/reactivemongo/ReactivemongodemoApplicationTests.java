package com.rohan.springboot.reactivemongo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.rohan.springboot.reactivemongo.collections.Product;
import com.rohan.springboot.reactivemongo.controller.ProductController;
import com.rohan.springboot.reactivemongo.repos.ProductRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
class ReactivemongodemoApplicationTests {

	@Autowired
	ProductController controller;
	
	@MockBean
	ProductRepository repo;
	
	@Test
	void testAddProduct() {
		Product product = new Product(null,"iPhone","Its cool",1200D);
		Product savedProduct = new Product("abc123","iPhone","Its cool",1200D);
		
		when(repo.save(product)).thenReturn(Mono.just(savedProduct));
		
		StepVerifier.create(controller.addProduct(product))
					.assertNext(p -> {
						assertNotNull(p);
						assertNotNull(p.getId());
						assertEquals("abc123",p.getId());
					})
					.expectComplete()
					.verify();
		
		verify(repo).save(product);
		
	}
	
	@Test
	void testGetProducts() {
		when(repo.findAll())
			.thenReturn(Flux.just(
					new Product("abc123","iPhone","Its cool",1200D),
					new Product("abc124","iPhone","Its cool",1200D),
					new Product("abc125","iPhone","Its cool",1200D)));
		
		StepVerifier.create(controller.getProducts())
					.expectNextCount(3)
					.expectComplete()
					.verify();
		
		verify(repo).findAll();
	}

}
