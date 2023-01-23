/**
 * 
 */
package com.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.entities.Product;

/**
 * The Interface ProductDao.
 *
 * @author komalsingh01
 */
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	/**
	 * Find by product name or product brand or product code.
	 *
	 * @param tempProductName the temp product name
	 * @param tempProductBrand the temp product brand
	 * @param tempProductCode the temp product code
	 * @return the list
	 */
	public List<Product> findByProductNameOrProductBrandOrProductCode(String tempProductName, String tempProductBrand,
			int tempProductCode);
}
