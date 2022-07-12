/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.model.Authorities;
import lsv.com.vn.model.Cart;
import lsv.com.vn.model.Customer1;
import lsv.com.vn.model.User;

@Repository
@Transactional
public class Customer1DaoImpl implements Customer1Dao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addCustomer(Customer1 customer1) {
		Session session = sessionFactory.getCurrentSession();
		customer1.getUser().setEnabled(true);
		Authorities authorities = new Authorities();
		authorities.setAuthorities("ROLE_USER");
		authorities.setEmailId(customer1.getUser().getEmailId());
		
		Cart cart = new Cart();
		customer1.setCart(cart);
		cart.setCustomer(customer1);
		
		session.save(customer1);
		session.save(cart);
		
	}

	@Override
	public List<Customer1> getAllCustomer() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Customer1> customerList = session.createQuery("from Customer1").getResultList();
		return customerList;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Customer1 getCustmerByEmailId(String emailId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User where emailId=?");
		query.setString(0, emailId);
		User users = (User) query.uniqueResult();
		Customer1 customer = users.getCustomer1();
		return customer;
	}

}
