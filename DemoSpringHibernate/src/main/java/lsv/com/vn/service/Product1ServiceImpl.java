/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 11, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.dao.Product1Dao;
import lsv.com.vn.model.Product1;

@Service
@Transactional
public class Product1ServiceImpl implements Product1Service {

	@Autowired
	private Product1Dao product1Dao;
	@Override
	public List<Product1> getAllProduct() {
		// TODO Auto-generated method stub
		return product1Dao.getAllProduct();
	}

	@Override
	public Product1 getProductById(int productId) {
		// TODO Auto-generated method stub
		return product1Dao.getProductById(productId);
	}

	@Override
	public void deleteProduct(int productId) {
		product1Dao.deleteProduct(productId);
		
	}

	@Override
	public void addProduct(Product1 product1) {
		// TODO Auto-generated method stub
		product1Dao.addProduct(product1);
		
	}

	@Override
	public void editProduct(Product1 product1) {
		// TODO Auto-generated method stub
		product1Dao.editProduct(product1);
	}

}
