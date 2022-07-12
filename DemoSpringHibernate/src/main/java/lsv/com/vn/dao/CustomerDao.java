/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 22, 2022
*/
package lsv.com.vn.dao;

import java.util.List;

import lsv.com.vn.model.Customer;

public interface CustomerDao {

	public void addCustomer(Customer customer);
	public List<Customer> listCustomer();
	public void updateCustomer(Customer customer);
	public Customer getByCode(int custcode);
	public void deleteCustomer(int custcode);
	public List<Customer> getByName(String name);
	
	
}
