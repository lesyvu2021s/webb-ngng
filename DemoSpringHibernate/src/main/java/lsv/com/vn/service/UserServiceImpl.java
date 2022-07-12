/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lsv.com.vn.dao.UserDao;
import lsv.com.vn.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public List<User> getAllUser() {
		
		return userDao.getAllUser();
	}

	@Override
	@Transactional
	public void deleteUser(String emailId) {
		userDao.deleteUser(emailId);
		
	}

	@Override
	@Transactional
	public void addUser(User user) {
		userDao.addUser(user);
		
	}

	@Override
	@Transactional
	public User getUserById(String emailId) {
		
		return userDao.getUserById(emailId);
	}

}
