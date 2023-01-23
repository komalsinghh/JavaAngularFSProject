/**
 * 
 */
package com.product.entities;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

/**
 * The Class Product.
 *
 * @author komalsingh01
 */
@Entity
public class Product {
	
	/** The product code. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productCode;
	
	/** The product name. */
	private String productName;
	
	/** The product brand. */
	private String productBrand;
	
	/** The product price. */
	private int productPrice;
	
	/** The product description. */
	@Column(length = 1000000000)
	private String productDescription;
	
	/** The product category. */
	private String productCategory;
	
	/** The product image. */
	@Lob
	private byte[] productImage;

	/**
	 * Instantiates a new product.
	 */
	public Product() {
	}

	/**
	 * Instantiates a new product.
	 *
	 * @param productCode the product code
	 * @param productName the product name
	 * @param productBrand the product brand
	 * @param productPrice the product price
	 * @param productDescription the product description
	 * @param productCategory the product category
	 * @param productImage the product image
	 */
	public Product(int productCode, String productName, String productBrand, int productPrice,
			String productDescription, String productCategory, byte[] productImage) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productBrand = productBrand;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.productCategory = productCategory;
		this.productImage = productImage;
	}

	/**
	 * Gets the product code.
	 *
	 * @return the product code
	 */
	public int getProductCode() {
		return productCode;
	}

	/**
	 * Sets the product code.
	 *
	 * @param productCode the new product code
	 */
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	/**
	 * Gets the product name.
	 *
	 * @return the product name
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * Sets the product name.
	 *
	 * @param productName the new product name
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * Gets the product brand.
	 *
	 * @return the product brand
	 */
	public String getProductBrand() {
		return productBrand;
	}

	/**
	 * Sets the product brand.
	 *
	 * @param productBrand the new product brand
	 */
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	/**
	 * Gets the product price.
	 *
	 * @return the product price
	 */
	public int getProductPrice() {
		return productPrice;
	}

	/**
	 * Sets the product price.
	 *
	 * @param productPrice the new product price
	 */
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * Gets the product description.
	 *
	 * @return the product description
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * Sets the product description.
	 *
	 * @param productDescription the new product description
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * Gets the product image.
	 *
	 * @return the product image
	 */
	public byte[] getProductImage() {
		return productImage;
	}

	/**
	 * Sets the product image.
	 *
	 * @param productImage the new product image
	 */
	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	/**
	 * Gets the product category.
	 *
	 * @return the product category
	 */
	public String getProductCategory() {
		return productCategory;
	}

	/**
	 * Sets the product category.
	 *
	 * @param productCategory the new product category
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productBrand=" + productBrand
				+ ", productPrice=" + productPrice + ", productDescription=" + productDescription + ", productCategory="
				+ productCategory + ", productImage=" + Arrays.toString(productImage) + "]";
	}

}
