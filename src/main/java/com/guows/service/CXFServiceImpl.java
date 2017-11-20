/**
 * 
 */
package com.guows.service;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import com.guo.controller.PersonController;
import com.name3.name3_facade.CXFService;

/**
 *
 *
 * @author 娴ｆ粏锟斤拷 E-mail: Administrator
 * @version
 */
@WebService(serviceName = "cxfService")
public class CXFServiceImpl implements CXFService {
	private static Logger logger = Logger.getLogger(CXFServiceImpl.class);

	public String hello(String name) {
		logger.info("-------------------------------------------\n");
		System.out.println("com.guows.service.CXFServiceImpl.hello()执行成功:" + name);
		return "com.guows.service.CXFServiceImpl.hello()执行成功:" + name;
	}
}
