/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.dao;

import java.io.IOException;

import lsv.com.vn.model.Cart;

public interface CartDao {

	Cart getCartById(int cartId);
	public void addCart(Cart cart);
	Cart validateCustomer(int cartId) throws IOException;
}
