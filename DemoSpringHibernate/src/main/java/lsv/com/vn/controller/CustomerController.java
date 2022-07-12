/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 22, 2022
*/
package lsv.com.vn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lsv.com.vn.model.Customer;
import lsv.com.vn.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService ;
	
	@RequestMapping(value={"/", "/customer-list"})
	public String listCustomers(Model model) {
		try {
		model.addAttribute("listCustomer", customerService.listCustomers());
		return "customer-list";
		}catch (Exception e) {
			return "404";
		}
	}
	
	@RequestMapping(value = "/customer-save")
	public String addCustomer(Model model) {
		try {
		model.addAttribute("customer", new Customer());
		return "customer-save";
		}catch (Exception e) {
			return "404";
		}
	}
	
	@RequestMapping("/saveCustomer")
	public String doAddCustomer(@ModelAttribute("customer") Customer customer , Model model) {
		try {
		customerService.add(customer);
		model.addAttribute("listCustomer", customerService.listCustomers());
		return "customer-list";
		}catch (Exception e) {
			return "404";
		}
	}
	
	@RequestMapping("/customer-view/{custcode}")
	public String viewCustomer(@PathVariable int custcode , Model model) {
		try {
	 Customer customer = customerService.findByCode(custcode);
	 model.addAttribute("customer", customer);
	 return "customer-view" ;
		}catch (Exception e) {
			return "404";
		}
	}
	
	@RequestMapping("/customer-update/{custcode}")
	public String updateCustomer(@PathVariable int custcode , Model model) {
		try {
		Customer customer = customerService.findByCode(custcode);
		model.addAttribute("customer", customer);
		return "customer-update";
		}catch (Exception e) {
			return "404";
		}
	}
	
	@RequestMapping("/updateCustomer")
	public String doUpdateCustomer(@ModelAttribute("customer") Customer customer , Model model) {
		try {
		customerService.updateCustomer(customer);
		model.addAttribute("listCustomer", customerService.listCustomers());
		return "redirect:/customer-list";
		}catch (Exception e) {
			return "404";
		}
	}
	@RequestMapping("/deleteCustomer/{custcode}")
	public String deleteCustomer(@PathVariable int custcode, Model model) {
		try {
		customerService.deleteCustomer(custcode);
		model.addAttribute("listCustomer", customerService.listCustomers());
		return "redirect:/customer-list";
		}catch (Exception e) {
			return "404";
		}
	}
	@RequestMapping("customer/search")
	public String findByCustomerName(@RequestParam("txt") String txt , Model model) {
		try {
		List<Customer> customer = customerService.getByName(txt);
		model.addAttribute("listCustomer", customer);
		return "customer-list";
		}catch (Exception e) {
			return "404";
		}
		
	}
}
