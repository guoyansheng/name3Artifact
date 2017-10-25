/**
 * 
 */
package com.guows.model;

/**
 *
 *
 * @author 作者 E-mail: Administrator
 * @version 创建时间：2017年10月25日 上午12:15:52
 */
public class UserBean {
	private int id;
	private String name;

	public UserBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
