/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User  {

	@Id
	private String emailId;
	@Column(name = "password")
	private String password ; 
	
	@Column(name="enabled")
	private boolean enabled;
	
	@OneToOne(mappedBy = "user")
	private Customer1 customer1 ; 

	
	public Customer1 getCustomer1() {
		return customer1;
	}

	public void setCustomer1(Customer1 customer1) {
		this.customer1 = customer1;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPassword() {
		return password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
	
}
