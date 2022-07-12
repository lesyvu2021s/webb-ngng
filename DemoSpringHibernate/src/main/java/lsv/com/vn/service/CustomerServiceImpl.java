/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 22, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.dao.CustomerDao;
import lsv.com.vn.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao ;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	@Transactional
	public void add(Customer customer) {
		customerDao.addCustomer(customer);
		
	}

	@Override
	@Transactional
	public List<Customer> listCustomers() {
		
		return this.customerDao.listCustomer();
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
		
	}

	@Override
	@Transactional
	public Customer findByCode(int custcode) {
		
		return this.customerDao.getByCode(custcode);
	}

	@Override
	@Transactional
	public void deleteCustomer(int custcode) {
		customerDao.deleteCustomer(custcode);
		
	}

	@Override
	@Transactional
	public List<Customer> getByName(String name) {
		
		return customerDao.getByName(name);
	} 
	
	
	
	
}
