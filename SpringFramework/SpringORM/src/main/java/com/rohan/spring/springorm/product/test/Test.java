package com.rohan.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.springorm.product.dao.ProductDao;
import com.rohan.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");

//		Product product = new Product();

//		product.setId(1);
//		product.setName("Google Pixel");
//		product.setDesc("It's competitive!!");
//		product.setPrice(800);

//		productDao.create(product);
//		productDao.update(product);
//		productDao.delete(product);

//		product = productDao.read(2);
//		System.out.println(product);

		List<Product> products = productDao.read();

		for (Product product : products) {
			System.out.println(product);
		}

		context.close();
	}

}
