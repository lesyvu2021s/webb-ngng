/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 22, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import lsv.com.vn.model.Customer;

public interface CustomerService {

	public void add(Customer customer);
	public List<Customer> listCustomers();
	public void updateCustomer(Customer customer);
	public Customer findByCode(int custcode);
	public void deleteCustomer(int custcode);
	public List<Customer> getByName (String name);
}
