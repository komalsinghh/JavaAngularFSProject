/**
 * 
 */
package com.product.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.entities.Product;
import com.product.service.ProductService;

/**
 * The Class ProductServiceImpl.
 *
 * @author komalsingh01
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	/** The product dao. */
	@Autowired
	private ProductDao productDao;
	
	/**
	 * Gets the product details.
	 *
	 * @param productCode the product code
	 * @return the product details
	 */
	public Optional<Product> getProductDetails(int productCode) {
		return productDao.findById(productCode);
	}
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public List<Product> getAll(){
		return productDao.findAll();
	}
	
	/**
	 * Gets the products.
	 *
	 * @param productName the product name
	 * @param productBrand the product brand
	 * @param productCode the product code
	 * @return the products
	 */
	@Override
	public List<Product> getProducts(String productName, String productBrand, int productCode) {
		return productDao.findByProductNameOrProductBrandOrProductCode(productName, productBrand, productCode);
	}
	
}
