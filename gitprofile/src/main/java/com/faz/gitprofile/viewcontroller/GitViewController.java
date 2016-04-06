package com.faz.gitprofile.viewcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
class GitViewController {

	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public Object serve(final HttpServletRequest req, final HttpServletResponse resp) {
	    
	    Object object = "index";

	    return object;
	}
	
}
