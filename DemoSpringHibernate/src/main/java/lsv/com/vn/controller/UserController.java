/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lsv.com.vn.model.BillingAddress;
import lsv.com.vn.model.Customer1;
import lsv.com.vn.model.ShippingAddress;
import lsv.com.vn.model.User;
import lsv.com.vn.service.Customer1Service;
import lsv.com.vn.service.UserService;

@Controller
public class UserController {

	@Autowired
	private Customer1Service customer1Service ;

	
	
	public Customer1Service getCustomer1Service() {
		return customer1Service;
	}

	public void setCustomer1Service(Customer1Service customer1Service) {
		this.customer1Service = customer1Service;
	}

	@RequestMapping(value = "/customer/register")
	public ModelAndView getRegistrationForm() {
		Customer1 customer1 = new Customer1();
		User user = new User();
		BillingAddress ba = new BillingAddress();
		ShippingAddress sa = new ShippingAddress();
		customer1.setBillingAddress(ba);
		customer1.setShippingAddress(sa);
		customer1.setUser(user);
		return new ModelAndView("register" , "customer1" , customer1);
	}
	
	public String registerCustomer(@ModelAttribute(value = "customer1") Customer1 customer1 ,Model model ,
			BindingResult result) {
		if(result.hasErrors()) {
			return "register";
		}
		customer1Service.addCustomer(customer1);
		model.addAttribute("registerSuccess", "Đã đăng ký thành công. Đăng nhập bằng email và mật khẩu");
		return "login";
		
	}
	
}
