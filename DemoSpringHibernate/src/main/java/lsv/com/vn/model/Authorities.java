/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authorities {

	@Id
	private String emailId;
	@Column(name = "authorities")
	private String authorities;
	public String getEmailId() {
		return emailId;
	}
	public String getAuthorities() {
		return authorities;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
	
	
	
	
}
