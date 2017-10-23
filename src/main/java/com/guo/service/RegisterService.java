/**
 * 
 */
package com.guo.service;

import com.guo.model.modelVo.UserVO;

/**
 * 注册、补全、激活
 * 
 * @author Administrator
 *
 */
public interface RegisterService {
	/**
	 * 注册
	 * @param userVO
	 * @return
	 */
	public UserVO register(UserVO userVO);
}
