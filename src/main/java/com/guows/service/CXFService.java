/**
 * 
 */
package com.guows.service;

import javax.jws.WebService;

/**
 *
 *
 * @author 浣滆�� E-mail: Administrator
 * @version 鍒涘缓鏃堕棿锛�2017骞�10鏈�26鏃� 涓嬪崍11:55:00
 */
public interface CXFService {
	
	public String hello(String name);
	
/*	public static void main(String[] args) {
		JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
		bean.setAddress("http://localhost:9090/hello");
		bean.setServiceClass(CXFServer.class);
		bean.create();
		System.out.println("鏈嶅姟宸茬粡寮�鍚�!");
	}  */   
	//浼犵粺鐨勭洿鎺ヨ繍琛岃繖涓被灏卞彲浠ュ彂甯僑ervice鏈嶅姟浜嗐�備絾鏄幇鍦ㄣ鐩存帴鍜宻pring鏁翠釜灏变笉闇�瑕佷娇鐢ㄨ繖涓柟寮忎簡
}
