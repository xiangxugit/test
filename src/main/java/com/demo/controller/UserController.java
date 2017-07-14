package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.demo.model.User;
import com.demo.service.UserService;
 
@Controller
public class UserController {
 
	@Autowired
	private UserService userService;
	
    @RequestMapping(value="index")
    public ModelAndView index(User user){
    	userService.insertUser(user);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("index");
        mav.addObject("user",user);
        return mav;
    }
    
    
    //index.jsp做一些准备工作，或者是一个app过渡界面
    
    
    
    @RequestMapping(value="/tiaozhuan",method=RequestMethod.GET)
	public ModelAndView tiaozhuan(@RequestParam(value="type", required=true) String type 
			){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		mv.addObject("type",type);
		return mv;
	}
    
    @RequestMapping(value="/getAllUser",method=RequestMethod.GET)
    @ResponseBody
    public String  getAllUser(){
    	List<User> test = userService.getAllUser();
    	String backString = JSONObject.toJSONString(test);
        return backString;
    }
    
    

    @RequestMapping(value="Login",method=RequestMethod.POST)
    @ResponseBody
 	public String Login(@RequestParam(value="username", required=true) String username,
 			@RequestParam(value="password", required=true) String password
 			){
// 	
    	User user = new User();
    	user.setName(username);
    	user.setPassword(password);
    	User userget = userService.login(user);
    	return JSONObject.toJSONString(userget)
    			;
 	}
     
    
    
    //四种方式测试
    @RequestMapping("requesttypeone")
    public String requesttypeone(@RequestParam(value="username")String username, String password, HttpServletRequest request)
    {
    	String usernametestvalue = username;
    	String passwordvalue = password;
    	System.out.println("usernametestvalue"+usernametestvalue);
    	System.out.println("passwordvalue"+passwordvalue);
//    	return "index.jsp";
    	return "login.html";
    	
    	
    }
    
    
    
}