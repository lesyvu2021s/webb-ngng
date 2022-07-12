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

import lsv.com.vn.model.Customer1;

@Service
@Transactional
public class Customer1ServiceImpl implements Customer1Service {
	
	@Autowired
	private Customer1Service customer1Service;
	
	
	public Customer1Service getCustomer1Service() {
		return customer1Service;
	}

	public void setCustomer1Service(Customer1Service customer1Service) {
		this.customer1Service = customer1Service;
	}

	@Override
	public void addCustomer(Customer1 customer1) {
		customer1Service.addCustomer(customer1);
		
	}

	@Override
	public List<Customer1> getAllCustomer() {
		
		return customer1Service.getAllCustomer();
	}

	@Override
	public Customer1 getCustmerByEmailId(String emailId) {
		
		return customer1Service.getCustmerByEmailId(emailId);
	}

}
