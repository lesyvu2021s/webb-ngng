/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 24, 2022
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
import lsv.com.vn.model.Orders;
import lsv.com.vn.model.Product;
import lsv.com.vn.service.CustomerService;
import lsv.com.vn.service.OrdersService;
import lsv.com.vn.service.ProductService;

@Controller
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	@Autowired
	private ProductService productService;

	@RequestMapping("/orders/{prodCode}")
	public String insertOrders(Model model, @PathVariable("prodCode") int prodCode) {
		
		try {
		
		Product product = productService.getByCode(prodCode);
		
		model.addAttribute("product", product);
		model.addAttribute("orders", new Orders());
		return "orders-save";
		}catch (Exception e) {
			return "404";
		}
	}

	@RequestMapping("/saveOrders")
	public String dosaveOrders(@ModelAttribute("orders") Orders orders , Model model) {
		try {
			
		ordersService.addOrder(orders);
		model.addAttribute("listOrders", ordersService.listOrder());
		return "orders-list";
		}catch (Exception e) {
			return "404";
		}
	}

	@RequestMapping("/orders-list")
	public String listOrders(Model model) {
		try {
		List<Orders> orders = ordersService.listOrder();
		
		model.addAttribute("listOrders", orders);
		return "orders-list";
		}catch (Exception e) {
			return "404";
		}
	}
	
	@RequestMapping("/orders-update/{ordersCode}")
	public String update(@PathVariable("ordersCode") int ordersCode , Model model) {
		try {
		Orders orders = ordersService.getByCode(ordersCode);
		model.addAttribute("orders", orders);
		return "orders-update";
		}catch (Exception e) {
			return "404";
		}
	}
	
	@RequestMapping("/updateOrders")
	public String doUpdate(@ModelAttribute("orders") Orders orders,Model model) {
		try {
		ordersService.updateOrder(orders);
		model.addAttribute("listOrders", ordersService.listOrder());
		return "redirect:/orders-list";
		}catch (Exception e) {
			return "404";
		}
	}
	
	
	
}
