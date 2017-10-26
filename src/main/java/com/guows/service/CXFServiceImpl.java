/**
 * 
 */
package com.guows.service;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import com.guo.controller.PersonController;

/**
 *
 *
 * @author 娴ｆ粏锟斤拷 E-mail: Administrator
 * @version 閸掓稑缂撻弮鍫曟？閿涳拷2017楠烇拷10閺堬拷27閺冿拷 娑撳﹤宕�12:36:37
 */
@WebService(serviceName = "cxfService")
public class CXFServiceImpl implements CXFService {
	private static Logger logger = Logger.getLogger(CXFServiceImpl.class);

	public String hello(String name) {
		logger.info("-------------------------------------------");
		System.out.println("鐎规瓕灏欑划鈩冩交濞戞ê寮抽柡鍫濈Т婵喖宕抽敓锟�:" + name);
		return "濞寸姴瀛╁﹢鍥礉閳ヨ櫕鐝ら弶鈺傛煥濞叉牠宕愰敓锟�:" + name;
	}
}
