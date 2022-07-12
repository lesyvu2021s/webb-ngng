/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 24, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import lsv.com.vn.model.Orders;

public interface OrdersService {

	
	
	public void updateOrder(Orders orders);
	
	public void deleteOrder(int orderCode);
	
	public List<Orders> listOrder();
	
	public Orders getByCode(int orderCode);
	
	public void addOrder(Orders orders);
}
