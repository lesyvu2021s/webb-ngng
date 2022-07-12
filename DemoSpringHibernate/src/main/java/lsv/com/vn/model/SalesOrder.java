/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salesOrder")
public class SalesOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int salesOrderId ; 
	
	@OneToOne
	@JoinColumn(name = "cart_id")
	private Cart cart ; 
	
	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer1 customer1;
	
	@OneToOne
	@JoinColumn(name = "billingAddress_id")
	private BillingAddress billingAddress;
	
	@OneToOne
	@JoinColumn(name = "shippingAddress_id")
	private ShippingAddress shippingAddress;

	public int getSalesOrderId() {
		return salesOrderId;
	}

	public Cart getCart() {
		return cart;
	}

	public Customer1 getCustomer1() {
		return customer1;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setSalesOrderId(int salesOrderId) {
		this.salesOrderId = salesOrderId;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public void setCustomer1(Customer1 customer1) {
		this.customer1 = customer1;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	
	
}
