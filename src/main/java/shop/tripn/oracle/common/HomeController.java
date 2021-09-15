package shop.tripn.oracle.common;

//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

//import java.text.DateFormat;
//import java.util.Date;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("contextPath")
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(
			HttpSession session,
			HttpServletRequest request) {
		String contextPath = request.getContextPath();
		session.setAttribute("contextPath", contextPath);
		return "index";
	}
	@RequestMapping("/move/{dir}/{jsp}")
	public String join(@PathVariable String dir, @PathVariable String jsp) {
		if(dir.equals("home")) {return "redirect:/";}
		return dir+"/"+jsp;
	}
}


/*
	@RequestMapping(value="/loginform", method = RequestMethod.GET)
	public String login(Locale locle, Model model) {
		return "/user/Login";
	}
	@RequestMapping(value="/joinform", method = RequestMethod.GET)
	public String join(Locale locle, Model model) {
		return "/user/Join";
	} 
	@RequestMapping(value="/bookform", method= {RequestMethod.GET})
	public String book(Locale locle, Model model) {
		return "/book/List";
	}
	@RequestMapping(value="/orderform", method= {RequestMethod.GET})
	public String order(Locale locle, Model model) {
		return "/order/Register";
	}
	@RequestMapping(value="/pubform", method= {RequestMethod.GET})
	public String publisher(Locale locle, Model model) {
		return "/publisher/publisher";
	}*/