/**
 * 
 */
package com.product.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entities.Product;
import com.product.service.ProductService;

/**
 * The Class ProductAppController.
 *
 * @author komalsingh01
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductAppController {
	
	/** The product service. */
	@Autowired
	private ProductService productService;

	/**
	 * Gets the product details.
	 *
	 * @param productCode the product code
	 * @return the product details
	 */
	@GetMapping("/details/{productCode}")
	public Optional<Product> getProductDetails(@PathVariable("productCode") int productCode) {
		return productService.getProductDetails(productCode);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@GetMapping("/details")
	public List<Product> getAll() {
		return productService.getAll();
	}
	
	/**
	 * Search product.
	 *
	 * @param product the product
	 * @return the list
	 * @throws Exception the exception
	 */
	@PostMapping("/search")
	public List<Product> searchProduct(@RequestBody Product product) throws Exception{
		System.out.println(product);
		String tempProductName=product.getProductName();
		String tempProductBrand=product.getProductBrand();
		int tempProductCode=product.getProductCode();
		List<Product> productObj=null;
		productObj= productService.getProducts(tempProductName,tempProductBrand,tempProductCode);
		System.out.println(productObj);
		return productObj;
	}
}
