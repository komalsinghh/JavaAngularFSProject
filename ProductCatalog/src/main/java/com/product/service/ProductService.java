/**
 * 
 */
package com.product.service;

import java.util.*;

import com.product.entities.Product;

/**
 * The Interface ProductService.
 *
 * @author komalsingh01
 */
public interface ProductService {
	
	/**
	 * Gets the product details.
	 *
	 * @param productCode the product code
	 * @return the product details
	 */
	public Optional<Product> getProductDetails(int productCode);

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public List<Product> getAll();

	/**
	 * Gets the products.
	 *
	 * @param tempProductName the temp product name
	 * @param tempProductBrand the temp product brand
	 * @param tempProductCode the temp product code
	 * @return the products
	 */
	public List<Product> getProducts(String tempProductName, String tempProductBrand, int tempProductCode);
}
