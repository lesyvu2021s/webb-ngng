/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.dao;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lsv.com.vn.model.Cart;

@Repository
public class CartDaoImpl implements CartDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private SalesOrderDao salesOrderDao;
	
	@Override
	public Cart getCartById(int cartId) {
		Session session = sessionFactory.getCurrentSession();
		Cart cart = session.get(Cart.class, cartId);
		return cart;
	}

	@Override
	public void addCart(Cart cart) {
		Session session = sessionFactory.getCurrentSession();
		session.save(cart);
		
	}

	@Override
	public Cart validateCustomer(int cartId) throws IOException {
		
		return null;
	}
	
	public void update (Cart cart) {
		int cartId = cart.getCartId();
		
	}

}
