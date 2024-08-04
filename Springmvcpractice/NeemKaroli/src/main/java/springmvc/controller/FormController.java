package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
	@RequestMapping("/complexform")
	public String showform() {
		return "complex_form";
	}
	
	@RequestMapping(path="/handleform", method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("student")Student student) {
		
		return "complexformresult";
	}
}
