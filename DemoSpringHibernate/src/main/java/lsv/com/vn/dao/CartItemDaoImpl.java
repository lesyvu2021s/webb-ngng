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
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.model.Cart;
import lsv.com.vn.model.CartItem;

@Repository
@Transactional
public class CartItemDaoImpl implements CartItemDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void addCartItem(CartItem cartItem) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cartItem);
		
	}

	@Override
	public void deleteCartItem(int cartItemId) {
		Session session = sessionFactory.getCurrentSession();
		CartItem cartItem = session.get(CartItem.class, cartItemId);
		session.delete(cartItem);
		Cart cart = cartItem.getCart();
		List<CartItem> cartItems = cart.getCartItem();
		cartItems.remove(cartItem);
		
		
	}

	@Override
	public void deleteAllCartItem(Cart cart) {
		Session session = sessionFactory.getCurrentSession();
		List<CartItem> cartItems = cart.getCartItem();
		for(CartItem item : cartItems) {
			deleteCartItem(item.getCartItemId());
		}
		
	}

}
