/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.dao;

import java.util.List;

import lsv.com.vn.model.Customer1;

public interface Customer1Dao {

	void addCustomer(Customer1 customer1);
	List<Customer1> getAllCustomer();
	Customer1 getCustmerByEmailId(String emailId);
}
