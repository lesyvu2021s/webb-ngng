/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "customerPhone")
	private String customerPhone;
	
	@OneToOne
	@JoinColumn(name = "cart_id")
	private Cart cart ; 
	
	@OneToOne
	@JoinColumn(name = "billingAddress_id")
	private BillingAddress billingAddress;
	
	@OneToOne
	@JoinColumn(name = "shippingAddress_id")
	private ShippingAddress shippingAddress;
	
	@OneToOne
	@JoinColumn(name = "user_emailId")
	private User user ; 
	
	
	public int getCustomerId() {
		return customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public Cart getCart() {
		return cart;
	}
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public User getUser() {
		return user;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
