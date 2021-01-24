package com.yash.demo.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {
	
	@GetMapping({"/","/hello"})
	public String hello(@RequestParam(value ="name",defaultValue="World",required =true) String name,Model model)
	{
		System.out.println("The data is been invoked");
		String data="HEXAWARE !! HAPPY TO JOIN YOU ";
		
		model.addAttribute("name",data);
		
		
		return "hello";
	}
	

}
