/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 22, 2022
*/
package lsv.com.vn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lsv.com.vn.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addProduct(Product product) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(product);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Product> getProduct() {
		Session session = this.sessionFactory.getCurrentSession();
		
		List<Product> listProduct = session.createQuery("from Product").getResultList();
		return listProduct;
	}

	@Override
	public void updateProduct(Product product) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(product);
		
	}

	@Override
	public void deleteProduct(int prodCode) {
		Session session = this.sessionFactory.getCurrentSession();
		Product product = session.get(Product.class, prodCode);
		session.delete(product);
		
	}

	@Override
	public Product getByCode(int prodCode) {
		Session session = this.sessionFactory.getCurrentSession();
		Product product = session.get(Product.class, prodCode);
		return product;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Product> getByName(String name) {
		Session session = this.sessionFactory.getCurrentSession();
		String query = "from Product p WHERE p.name LIKE '%"+name+"%'";
		List<Product> listProduct = session.createQuery(query).getResultList();
		return listProduct;
	}

}
