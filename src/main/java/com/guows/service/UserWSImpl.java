/**
 * 
 */
package com.guows.service;

import javax.jws.WebService;

import com.guows.model.UserBean;

/**
 *
 *
 * @author 娴ｆ粏锟斤拷 E-mail: Administrator
 * @version 閸掓稑缂撻弮鍫曟？閿涳拷2017楠烇拷10閺堬拷25閺冿拷 娑撳﹤宕�12:18:08
 */
@WebService(serviceName = "userWS")
public class UserWSImpl implements UserWS {
	public UserWSImpl() {
		System.out.println("閸掓繂顫愰崠锟� UserWSImpl");
	}

	@Override
	public UserBean getUserById(int id) {
		System.out.println("server getUserById:" + id);
		return new UserBean(1, "瀵姳绗�");

	}
}
