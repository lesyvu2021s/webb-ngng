/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	
	@Column(name = "totalPrice")
	private double totalPrice;
	
	@OneToOne(mappedBy = "cart")
	private Customer1 customer ;
	
	@OneToMany(mappedBy = "cart")
	private List<CartItem> cartItem;

	public int getCartId() {
		return cartId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Customer1 getCustomer() {
		return customer;
	}

	public List<CartItem> getCartItem() {
		return cartItem;
	}

	public void setCustomer(Customer1 customer) {
		this.customer = customer;
	}

	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}
	
	
}
