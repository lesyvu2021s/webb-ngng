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

import lsv.com.vn.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory ;
	
	@Override
	public void addCustomer(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(customer);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> listCustomer() {
		Session session = this.sessionFactory.getCurrentSession();
		
		List<Customer> CustomerList = session.createQuery("From Customer").getResultList();
		return CustomerList;
	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(customer);;
		
	}

	@Override
	public Customer getByCode(int custcode) {
		Session session = this.sessionFactory.getCurrentSession();
		
		return session.get(Customer.class, custcode);
		
	}

	@Override
	public void deleteCustomer(int custcode) {
		Session session = this.sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, custcode);
		session.delete(customer);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getByName(String name) {
		Session session = this.sessionFactory.getCurrentSession();
		String query ="From Customer WHERE name LIKE '%"+name+"%'";
		return session.createQuery(query).getResultList();
	}

	
}
