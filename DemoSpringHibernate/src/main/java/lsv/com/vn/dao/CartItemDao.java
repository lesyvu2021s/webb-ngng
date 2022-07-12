/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 11, 2022
*/
package lsv.com.vn.dao;

import lsv.com.vn.model.Cart;
import lsv.com.vn.model.CartItem;

public interface CartItemDao {
	
	void addCartItem(CartItem cartItem);
	void deleteCartItem(int cartItemId);
	void deleteAllCartItem(Cart cart);
}
