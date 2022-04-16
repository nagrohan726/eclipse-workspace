package com.rohan.spring.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.rohan.spring.data.entities.Product;
import com.rohan.spring.data.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);

		Product product = new Product();
		product.setId(1L);
		product.setName("Mac");
		product.setDescription("Awesome");
		product.setPrice(1200D);
//		repository.save(product);
//
//		Product product2 = null;
//		Long id = 1L;
//		Optional<Product> optionalProduct = repository.findById(id);
//		if (optionalProduct.isPresent()) {
//			product2 = optionalProduct.get();
//			System.out.println(product2);
//		} else {
//			System.err.println("Product with ID " + id + " doesnt exist");
//		}
//
//		product2.setPrice(1500D);
//		repository.save(product2);
//
//		repository.findAll().forEach(p -> System.out.println(p));
//
//		repository.deleteById(id);
//		repository.findAll().forEach(p -> System.out.println(p));
//
//		System.out.println(repository.count());

		System.out.println(repository.findByName("Mac"));

		System.out.println(repository.findByPrice(700D));

		System.out.println(repository.findByNameAndPrice("Google Pixel", 600D));

	}

}
