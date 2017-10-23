/**
 * 
 */
package com.guo.service;

import com.guo.model.modelDo.User;

/**
 * @author Administrator
 *
 */
public interface LoginService {

	public User doLogin(String loginName, String loginPassword);
}
