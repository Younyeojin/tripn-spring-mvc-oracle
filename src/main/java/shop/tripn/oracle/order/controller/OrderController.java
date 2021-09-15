package shop.tripn.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.tripn.oracle.order.domain.OrderDto;
import shop.tripn.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController{
	@Autowired OrderService orderService;
	
	@RequestMapping(value="/order", method= RequestMethod.POST)
	public String save(OrderDto t) {
		orderService.save(t);
		return "Save Success";
	}

	@RequestMapping("/find/{id}")
	public OrderDto findById(Integer id) {
		return orderService.findById(id);
	}

	@RequestMapping("/list")
	public List<OrderDto> findAll() {
		return orderService.findAll();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(OrderDto t) {
		orderService.update(t);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public void delete(Integer id) {
		orderService.delete(id);
	}

	@RequestMapping("/find/custId")
	public void findByCustId(@PathVariable int custId) {
		List<OrderDto> orders = orderService.findByCustId(custId);
		for (OrderDto o : orders) {System.out.println(o.toString());}
	}

	@RequestMapping("/find/bookId")
	public List<OrderDto> findByBookId(@PathVariable int  bookId) {
		return orderService.findByBookId(bookId);
	}

	@RequestMapping("/find/orderPrice")
	public List<OrderDto> findByOrderPrice(@PathVariable String orderPrice) {
		return orderService.findByOrderPrice(orderPrice);
	}

	@RequestMapping("/find/orderDate")
	public List<OrderDto> findByOrderDate(@PathVariable String orderDate) {
		return orderService.findByOrderDate(orderDate);
	}
}
