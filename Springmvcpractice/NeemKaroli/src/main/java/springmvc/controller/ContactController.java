package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	/*
	 * @RequestMapping(path ="/processform",method=RequestMethod.POST) public String
	 * processForm(
	 * 
	 * @RequestParam(name="email",required=false) String userEmail,
	 * 
	 * @RequestParam("username") String userName,
	 * 
	 * @RequestParam("userpwd") String userPwd,Model model) {
	 * 
	 * System.out.println("User Email is "+userEmail);
	 * System.out.println("User name is "+userName);
	 * System.out.println("User password is "+userPwd);
	 * 
	 * model.addAttribute("email", userEmail); model.addAttribute("name", userName);
	 * model.addAttribute("pwd", userPwd); return "success"; }
	 */
	
	@RequestMapping(path = "/processform", method=RequestMethod.POST)
	public String processForm(@ModelAttribute User user,Model model) {
		
		return "success";
	}
}
