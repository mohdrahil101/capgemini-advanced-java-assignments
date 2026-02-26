package com.springmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvc.demo.model.Product;
import com.springmvc.demo.service.ProductService;

import java.util.List;

@Controller
public class ProductController {

	ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService=productService;
	}

@GetMapping("/products")
public String productsMapper(Model model) {
	List<Product> productsList=productService.fetchProducts();
	model.addAttribute("products",productsList);
	return "products";
	
}
}
