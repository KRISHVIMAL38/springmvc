package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;

@Controller
public class HomeController{
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView();
		List<String>list=new ArrayList<String>();
		list.add("Jai SitaRam");
		list.add("Jai Shree Ram");
		list.add("Jai Hanumaan");
		mv.addObject("name",list);
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(path="/register",method=RequestMethod.POST)
	public String register(@ModelAttribute User user, Model mode) {
		return "success";
	}
}