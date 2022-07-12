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
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "custcode")
	private int custCode ; 
	@Column(name = "name")
	private String name ; 
	@Column(name = "address")
	private String address ; 
	@Column(name = "phone")
	private String phone ;
	

	
	public Customer() {
		super();
	}
	public int getCustCode() {
		return custCode;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public void setCustCode(int custCode) {
		this.custCode = custCode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Customer(int custCode) {
		super();
		this.custCode = custCode;
	} 
	
	
	
}
