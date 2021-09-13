package shop.tripn.oracle.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	@RequestMapping(value="/join", method= {RequestMethod.POST})
	public String join(
			@RequestParam("custId") String custId,
			@RequestParam("custName") String custName, 
			@RequestParam("address") String address,
			@RequestParam("phone") String phone) {
		System.out.println("custId : " + custId);
		System.out.println("custName : " + custName);
		System.out.println("address : " + address);
		System.out.println("phone : " + phone);
		return "회원가입 성공";
	}
	@RequestMapping(value="/login", method= {RequestMethod.POST})
	public String login() {
		return "회원가입 성공";
	}
}
