/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 24, 2022
*/
package lsv.com.vn.dao;

import java.util.List;

import javax.persistence.QueryHint;

import lsv.com.vn.model.Orders;

public interface OrdersDao {

	public void addOrder(Orders orders);
	
	public void updateOrder(Orders orders);
	
	public void deleteOrder(int orderCode);
	
	public List<Orders> listOrder();
	
	public Orders getByCode(int orderCode);
	
	
	
	
	
}
