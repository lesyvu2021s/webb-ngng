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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "billingAddress")
public class BillingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int billInAddressId; 
	

	private String address ; 
	private String city; 
	private String town ; 
	private String wards ;
	private String zipcode;
	
	@OneToOne(mappedBy = "billingAddress")
	private Customer1 customer1 ;

	public int getBillInAddressId() {
		return billInAddressId;
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

	public void setBillInAddressId(int billInAddressId) {
		this.billInAddressId = billInAddressId;
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
