package com.springmvc.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springmvc.demo.model.Product;

@Repository
public class ProductDao {
	public List<Product> getAllProducts(){
		List<Product> productsList=Arrays.asList(
				new Product(101,"headphone",3000),
				new Product(102,"laptop",60000),
				new Product(103,"mouse",500)
				);
		return productsList;
	}
}
