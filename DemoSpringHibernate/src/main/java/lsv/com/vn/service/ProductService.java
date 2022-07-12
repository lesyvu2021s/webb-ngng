/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 22, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import lsv.com.vn.model.Product;

public interface ProductService {

	public void addProduct(Product product);
	public List<Product> getProduct();
	public void updateProduct(Product product);
	public void deleteProduct(int prodCode);
	public Product getByCode(int prodCode); 
	public List<Product> getByName(String name);
}
