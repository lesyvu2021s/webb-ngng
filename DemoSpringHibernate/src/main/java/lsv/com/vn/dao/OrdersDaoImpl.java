/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 24, 2022
*/
package lsv.com.vn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lsv.com.vn.model.Customer;
import lsv.com.vn.model.Orders;
import lsv.com.vn.model.Product;

@Repository
public class OrdersDaoImpl implements OrdersDao {

	@Autowired
	private SessionFactory sessionFactory ;
	
	
	

	@Override
	public void updateOrder(Orders orders) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(orders);
		
	}

	@Override
	public void deleteOrder(int orderCode) {
		Session session = this.sessionFactory.getCurrentSession();
		Orders order = session.get(Orders.class, orderCode);
		session.delete(order);
		
	}
	
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Orders> listOrder() {
		Session session = this.sessionFactory.getCurrentSession();
		
		List<Orders> listOrders = session.createQuery("From Orders").getResultList();
		
		return listOrders;
	}

	@Override
	public Orders getByCode(int orderCode) {
		Session session = this.sessionFactory.getCurrentSession();
		Orders order = session.get(Orders.class, orderCode);
		return order;
		
	}

	@Override
	public void addOrder(Orders order) {
		Session session = this.sessionFactory.getCurrentSession();
		
		session.save(order);
	}

	
	
	
}
