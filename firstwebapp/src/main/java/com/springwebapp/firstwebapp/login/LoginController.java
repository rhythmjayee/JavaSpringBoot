package com.springwebapp.firstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
		
private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="login",method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String submitLoginPage(@RequestParam String name, 
			@RequestParam String password, HttpServletResponse httpResponse) throws Exception  {
		if(authenticationService.authenticate(name, password)) {
			String uri = "/welcome?"+"name="+name;
			httpResponse.sendRedirect(uri);
		}
		return "login";
	}

	@RequestMapping(value="welcome",method = RequestMethod.GET)
	//wlcome?name=rhythm RequestParam
	public String gotoWelcomePage(@RequestParam String name, ModelMap model) {
		//model -> used to insert data in JSP
		model.put("name", name);
		return "welcome";
	}
}
