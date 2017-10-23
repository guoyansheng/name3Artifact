package com.guo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guo.model.modelDo.Person;
import com.guo.service.PersonService;

@Controller
@RequestMapping("/personController")
public class PersonController extends BaseController{
	@Autowired
    private PersonService personService;
    
    public PersonService getPersonService() {
        return personService;
    }

    //@Autowired
//    public void setPersonService(IPersonService personService) {
//        this.personService = personService;
//    }

    @RequestMapping("/showPerson.htm")
    public String showPersons(Model model){
        List<Person> persons = personService.loadPersons();
        model.addAttribute("persons", persons);
        return "showperson.jsp";
    }
    @RequestMapping("/test.json")
    public void test(Model model,HttpServletResponse response){
        List<Person> persons = personService.loadPersons();
        model.addAttribute("persons", persons);
        
        Map<String,Object> jsonMap = new HashMap<String,Object>();
         
        try {
            //设置页面不缓存
            response.setContentType("application/json");
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out= null;
            out = response.getWriter();
            out.print(model);
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}