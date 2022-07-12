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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cartItem")
public class CartItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartItemId;
	
	@Column(name = "quality")
	private int quality ; 
	
	@Column(name = "price")
	private double price ; 
	
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart ;

	public int getCartItemId() {
		return cartItemId;
	}

	public int getQuality() {
		return quality;
	}

	public double getPrice() {
		return price;
	}

	

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	
	
	
}
