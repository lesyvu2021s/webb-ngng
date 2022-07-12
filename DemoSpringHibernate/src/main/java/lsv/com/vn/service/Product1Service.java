/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 11, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import lsv.com.vn.model.Product1;

public interface Product1Service {
	List<Product1> getAllProduct();
	Product1 getProductById(int productId);
	void deleteProduct(int productId);
	void addProduct(Product1 product1);
	void editProduct(Product1 product1);
}
