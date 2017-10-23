/**
 * 
 */
package com.guo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guo.model.modelDo.Person;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/testController")
public class TestController extends BaseController{
	private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/test1.htm",method = RequestMethod.GET )
    public String test1Get(Model model){
        model.addAttribute("persons", "get");
        return "ceshi/test1Get.jsp";
    }
	@RequestMapping(value = "/test1.htm",method = RequestMethod.POST )
    public String test1Post(Model model){
        model.addAttribute("persons", "post");
        return "ceshi/test1Post.jsp";
    }
}
