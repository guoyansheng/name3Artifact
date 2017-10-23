/**
 * 
 */
package com.guo.service.impl;

import org.springframework.stereotype.Service;

import com.guo.model.modelDo.User;
import com.guo.service.LoginService;

/**
 * @author Administrator
 *
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService{

	/* (non-Javadoc)
	 * @see com.guo.service.LoginService#doLogin(java.lang.String, java.lang.String)
	 */
	@Override
	public User doLogin(String loginName, String loginPassword) {
		// TODO Auto-generated method stub
		User user = new User();
		
		return user;
	}

}
