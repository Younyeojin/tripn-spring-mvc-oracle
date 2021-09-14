package shop.tripn.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.customer.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController implements GenericInterface<CustomerDto, Integer>{
	@Autowired CustomerService customerService;

	@RequestMapping("/save")
	public void save(CustomerDto t) {
		// TODO Auto-generated method stub
		customerService.save(t);
	}

	@RequestMapping("/find/{id}")
	public CustomerDto findById(Integer id) {
		// TODO Auto-generated method stub
		return customerService.findById(id);
	}

	@RequestMapping("/list")
	public List<CustomerDto> findAll() {
		// TODO Auto-generated method stub
		return customerService.findAll();
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(CustomerDto t) {
		// TODO Auto-generated method stub
		customerService.update(t);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		customerService.delete(id);
	}
	
}

/**@Autowired CustomerService customerService;
	@Autowired CustomerDto customer;
	
	@RequestMapping(value="/join", method= {RequestMethod.POST})
	public String join(
			@RequestParam("custId") int custId,
			@RequestParam("custName") String custName, 
			@RequestParam("address") String address,
			@RequestParam("phone") String phone) {
		System.out.println("custId : " + custId);
		System.out.println("custName : " + custName);
		System.out.println("address : " + address);
		System.out.println("phone : " + phone);
		customer = new CustomerDto();
		customer.setCustId(custId);
		customer.setAddress(address);
		customer.setCustName(custName);
		customer.setPhone(phone);
		customerService.save(customer);
		return "user/Join";
	}
	@RequestMapping(value="/login", method= {RequestMethod.POST})
	public String login(
			@RequestParam("custId") int custId,
			@RequestParam("custName") String custName)
			 {
		customer = new CustomerDto();
		customer.setCustId(custId);
		
		customer.setCustName(custName);
		
		customerService.save(customer);
		return "user/Join";
	}*/