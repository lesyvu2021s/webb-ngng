/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 24, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.dao.OrdersDao;
import lsv.com.vn.model.Orders;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersDao ordersDao;

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}

	@Override
	@Transactional
	public void updateOrder(Orders orders) {
		ordersDao.updateOrder(orders);

	}

	@Override
	@Transactional
	public void deleteOrder(int orderCode) {
		ordersDao.deleteOrder(orderCode);

	}

	@Override
	@Transactional
	public List<Orders> listOrder() {
		// List<Orders> listOrders1 = this.ordersDao.listOrder();

		return this.ordersDao.listOrder();
	}

	@Override
	@Transactional
	public Orders getByCode(int orderCode) {

		return this.ordersDao.getByCode(orderCode);
	}

	@Override
	@Transactional
	public void addOrder(Orders orders) {
		 ordersDao.addOrder(orders);

	}

}
