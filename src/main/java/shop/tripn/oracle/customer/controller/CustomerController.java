package shop.tripn.oracle.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	@RequestMapping("/join")
	public String join() {
		return "회원가입 성공";
	}
	@RequestMapping("/login")
	public String login() {
		return "회원가입 성공";
	}
}
