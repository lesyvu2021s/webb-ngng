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

import lsv.com.vn.model.Product;
import lsv.com.vn.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/product-list")
	public String listProduct(Model model) {
		try {
			model.addAttribute("listProduct", productService.getProduct());
			return "product-list";
		} catch (Exception e) {
			return "404";
		}
	}

	@RequestMapping("/product-save")
	public String insertProduct(Model model) {
		try {
			model.addAttribute("product", new Product());
			return "product-save";
		} catch (Exception e) {
			return "404";
		}
	}

	@RequestMapping("/product-update/{prodCode}")
	public String updateProduct(@PathVariable int prodCode, Model model) {
		try {
			Product product = productService.getByCode(prodCode);
			model.addAttribute("product", product);
			return "product-update";
		} catch (Exception e) {
			return "404";
		}
	}

	@RequestMapping("/updateProduct")
	public String doupdateProduct(@ModelAttribute("product") Product product, Model model) {
		try {
			productService.updateProduct(product);
			model.addAttribute("listProduct", productService.getProduct());
			return "redirect:/product-list";
		} catch (Exception e) {
			return "404";
		}
	}

	@RequestMapping("/saveProduct")
	public String saveProduct(@ModelAttribute Product product, Model model) {
		try {
			productService.addProduct(product);
			model.addAttribute("listProduct", productService.getProduct());

			return "product-list";
		} catch (Exception e) {
			return "404";
		}
	}

	@RequestMapping("/deleteProduct/{prodCode}")
	public String deleteProduct(@PathVariable int prodCode, Model model) {
		try {
			productService.deleteProduct(prodCode);
			model.addAttribute("listProduct", productService.getProduct());

			return "redirect:/product-list";
		} catch (Exception e) {
			return "404";
		}
	}

	@RequestMapping("/product/search")
	public String findByNameProduct(@RequestParam(value = "txt") String txt, Model model) {
		try {
			List<Product> product = productService.getByName(txt);
			model.addAttribute("listProduct", product);
			return "product-list";
		} catch (Exception e) {
			return "404";
		}
	}
}
