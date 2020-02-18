package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	@Autowired
	mysqlconnector mysql;
	
	
	@RequestMapping("/")
    public String home() {
		System.out.println("Inside the webapp");
		return "index.html";
	}
   @RequestMapping("adddata")
   public String adddata() {
		System.out.println("Inside the adddata");
		return "adddata.jsp";

	}
   @RequestMapping("/submit")
   @ResponseBody
   public String addtodatabase(@RequestParam("name") String fn,@RequestParam("roomno") String rn,@RequestParam("course") String cc,@RequestParam("mobile") String mn) {
	   studentdata st=new studentdata(fn,Integer.parseInt(rn),cc ,Long.parseLong(mn));
	   mysql.save(st);
	   return "Data Saved Successfully";
		
		

	}
}
