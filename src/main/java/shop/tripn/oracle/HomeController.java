package shop.tripn.oracle;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

//import java.text.DateFormat;
//import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	@RequestMapping(value="/loginform", method = RequestMethod.GET)
	public String login(Locale locle, Model model) {
		return "/user/Login";
	}
	@RequestMapping(value="/joinform", method = RequestMethod.GET)
	public String join(Locale locle, Model model) {
		return "/user/Join";
	}
}

//
//logger.info("Welcome home! The client locale is {}.", locale);
//
//Date date = new Date();
//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//
//String formattedDate = dateFormat.format(date);
//
//model.addAttribute("serverTime", formattedDate );
