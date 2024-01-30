package com.privan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.privan.model.Model;
import com.privan.servicei.ServiceI;

@RequestMapping("/privan-sport-analyser")
@Controller
public class HomeController {

	@Autowired
	ServiceI si;
 
	@RequestMapping("/datasave")
	public String ss() {
		System.out.println("dd");
		return "datasave";

	}

	@RequestMapping("/save")
	public String save(@ModelAttribute Model mod) {
		System.out.println("tt");
	    String m=si.saveData(mod);
		System.out.println("save");
		return "home";
	}

	@GetMapping("/home")
	public String playerX() { 

		System.out.println("HOME");

		return "home";

	}

	@GetMapping("/page1")
	public String team1() {

		System.out.println("page1");
		return "page1";
	}

	@GetMapping("/page2")
	public String team2() {

		System.out.println("page2");
		return "page2";
	}

	@GetMapping("/page3")
	public String team3() {

		System.out.println("page3");
		return "page3";
	}

}
