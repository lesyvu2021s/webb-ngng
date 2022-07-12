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
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "product")
public class Product1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId ; 
	
	@Column(name = "productCategory")
	private String productCategory;
	@Column(name = "productDescription")
	private String productDescription ;
	@Column(name = "productManufacturer")
	private String productManufacturer ; 
	@Column(name = "productName")
	private String productName;
	@Column(name = "productPrice")
	private String productPrice ;
	@Column(name = "unitStock")
	private String unitStock ;
	
	@Transient
	private MultipartFile productImage;

	public int getProductId() {
		return productId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public String getUnitStock() {
		return unitStock;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public void setUnitStock(String unitStock) {
		this.unitStock = unitStock;
	}

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
	
	
}
