package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String processform(User user,Model model) {
		return "result";
	}
}
