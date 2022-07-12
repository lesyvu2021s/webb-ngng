/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.service;

import lsv.com.vn.model.SalesOrder;

public interface SalesOrderService {

	void addSalesOrder(SalesOrder salesOrder);
	double getSalesOrderGrandTotal(int cartId);
}
