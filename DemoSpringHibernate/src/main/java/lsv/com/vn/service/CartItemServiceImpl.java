/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 11, 2022
*/
package lsv.com.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.dao.CartItemDao;
import lsv.com.vn.model.Cart;
import lsv.com.vn.model.CartItem;

@Service
@Transactional
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private CartItemDao cartItemDao;
	@Override
	public void addCartItem(CartItem cartItem) {
		cartItemDao.addCartItem(cartItem);
		
	}

	@Override
	public void deleteCartItem(int cartItemId) {
		cartItemDao.deleteCartItem(cartItemId);
		
	}

	@Override
	public void deleteAllCartItem(Cart cart) {
		cartItemDao.deleteAllCartItem(cart);
		
	}

}
