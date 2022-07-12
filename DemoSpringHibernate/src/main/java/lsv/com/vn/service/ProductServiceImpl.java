/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 22, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.dao.ProductDao;
import lsv.com.vn.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	
	@Override
	@Transactional
	public void addProduct(Product product) {
		productDao.addProduct(product);
		
	}

	@Override
	@Transactional
	public List<Product> getProduct() {
		
		return this.productDao.getProduct();
	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		productDao.updateProduct(product);
		
	}

	@Override
	@Transactional
	public void deleteProduct(int prodCode) {
		productDao.deleteProduct(prodCode);
		
	}

	@Override
	@Transactional
	public Product getByCode(int prodCode) {
		
		return productDao.getByCode(prodCode);
	}

	@Override
	@Transactional
	public List<Product> getByName(String name) {
		
		return productDao.getByName(name);
	}

	
}
