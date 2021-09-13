package shop.tripn.oracle;

//import java.text.DateFormat;
//import java.util.Date;
import java.util.Locale;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
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

//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//logger.info("Welcome home! The client locale is {}.", locale);
//
//Date date = new Date();
//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//
//String formattedDate = dateFormat.format(date);
//
//model.addAttribute("serverTime", formattedDate );
