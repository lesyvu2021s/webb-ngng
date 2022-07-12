/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import lsv.com.vn.model.User;

public interface UserService {

	List<User> getAllUser();
	void deleteUser(String emailId);
	void addUser(User user);
	User getUserById(String emailId);
}
