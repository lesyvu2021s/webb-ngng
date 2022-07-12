/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Mar 22, 2022
*/
package lsv.com.vn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prodcode")
	private int prodCode ; 
	
	
	@Column(name = "name")
	private String name ; 
	@Column(name = "price")
	private double price ;
	public Product() {
		
	}
	public int getProdCode() {
		return prodCode;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int prodCode) {
		super();
		this.prodCode = prodCode;
	}
	
	
	
}
