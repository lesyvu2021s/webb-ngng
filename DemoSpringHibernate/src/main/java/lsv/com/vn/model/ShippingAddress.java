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
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "shippingAddress")
public class ShippingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int shippingAddressId;
	
	@Column(name = "address")
	private String address ;
	@Column(name = "city")
	private String city;
	@Column(name = "town")
	private String town ;
	@Column(name = "wards")
	private String wards ;
	@Column(name = "zipcode")
	private String zipcode;
	
	@OneToOne(mappedBy = "shippingAddress")
	private Customer1 customer1 ;

	public int getShippingAddressId() {
		return shippingAddressId;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getTown() {
		return town;
	}

	public String getWards() {
		return wards;
	}

	public String getZipcode() {
		return zipcode;
	}

	public Customer1 getCustomer1() {
		return customer1;
	}

	public void setShippingAddressId(int shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public void setWards(String wards) {
		this.wards = wards;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setCustomer1(Customer1 customer1) {
		this.customer1 = customer1;
	} 
	
	
	
	
}
