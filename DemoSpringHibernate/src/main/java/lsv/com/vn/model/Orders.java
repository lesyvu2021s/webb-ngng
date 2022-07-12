/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 24, 2022
*/
package lsv.com.vn.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_code")
	private int orderCode;
	
	@Column(name = "prod_code")
	private int productCode ; 
	@Column(name = "cust_code")
	private int customerCode ; 

	@ManyToOne( cascade = CascadeType.ALL )
	@JoinColumn(name = "cust_code", insertable=false, updatable=false)
	private Customer customer;

	@OneToOne(cascade = CascadeType.ALL  )
	@JoinColumn(name = "prod_code", insertable=false, updatable=false)
	private Product product;

	@Column(name = "number")
	private int number;
	
	@Column(name = "total")
	private double total;
	
	
	
	public int getOrderCode() {
		return orderCode;
	}

	public int getNumber() {
		return number;
	}

	public void setOrderCode(int orderCode) {
		this.orderCode = orderCode;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getProductCode() {
		return productCode;
	}

	public int getCustomerCode() {
		return customerCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	
	

	


}
