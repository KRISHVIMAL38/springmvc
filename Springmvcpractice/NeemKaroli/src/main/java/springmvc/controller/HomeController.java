package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView view=new ModelAndView();
		view.addObject("name", "Krushna");
		view.addObject("rollno", "232");
		
		List<String>list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		view.addObject("count", list);
		view.setViewName("index");
		return view;
	}
}
