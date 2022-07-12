/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 11, 2022
*/
package lsv.com.vn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lsv.com.vn.model.Product1;

@Repository
public class Product1DaoImpl implements Product1Dao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Product1> getAllProduct() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Product1> productList = session.createQuery("From Product1").getResultList();
		
		return productList;
	}

	@Override
	public Product1 getProductById(int productId) {
		Session session = sessionFactory.getCurrentSession();
		Product1 product1 = session.get(Product1.class, productId);
		
		return product1;
	}

	@Override
	public void deleteProduct(int productId) {
		Session session = sessionFactory.getCurrentSession();
		Product1 product1 = session.get(Product1.class, productId);
		session.delete(product1);
		
	}

	@Override
	public void addProduct(Product1 product1) {
		Session session = sessionFactory.getCurrentSession();
		session.save(product1);
		
	}

	@Override
	public void editProduct(Product1 product1) {
		Session session = sessionFactory.getCurrentSession();
		session.update(product1);
		
	}

}
