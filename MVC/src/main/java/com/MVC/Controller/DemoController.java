package com.MVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

	@RequestMapping(method=RequestMethod.GET,value="/akash")
	public String message() {

	return "index";
	}

}
