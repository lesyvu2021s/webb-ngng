/*
* sản phẩm được phát triển bớt BitTech
* @authur techcare
* @date Jul 10, 2022
*/
package lsv.com.vn.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import lsv.com.vn.model.User;
@Component
public class PasswordValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target ;
		
		if(user.getPassword().length()<6 || user.getPassword().length()>30) {
			errors.rejectValue("password", null, "Mật khẩu  phải từ 6 đến 30 ký tự  ");
		}
		
	}

	
}
