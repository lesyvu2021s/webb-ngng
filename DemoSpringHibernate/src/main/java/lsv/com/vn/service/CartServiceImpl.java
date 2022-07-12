/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 11, 2022
*/
package lsv.com.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.dao.CartDao;
import lsv.com.vn.model.Cart;

@Service
@Transactional
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;
	
	@Override
	public Cart getCartById(int cartId) {
		
		return cartDao.getCartById(cartId);
	}

}
