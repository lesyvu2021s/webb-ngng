/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.dao.SalesOrderDao;
import lsv.com.vn.model.Cart;
import lsv.com.vn.model.CartItem;
import lsv.com.vn.model.SalesOrder;

@Service
@Transactional
public class SalesOrderServiceImpl implements SalesOrderService {

	@Autowired
	private SalesOrderDao salesOrderDao;
	
	@Autowired
	private CartService cartService;
	
	
	@Override
	public void addSalesOrder(SalesOrder salesOrder) {
		salesOrderDao.addSalesOrder(salesOrder);
		
	}

	@Override
	public double getSalesOrderGrandTotal(int cartId) {
		double grandTotal = 0 ; 
		Cart cart = cartService.getCartById(cartId);
		List<CartItem> cartItems =cart.getCartItem();
		for(CartItem item : cartItems) {
			grandTotal += item.getPrice();
		}
		return grandTotal;
	}
	
	
	
}
