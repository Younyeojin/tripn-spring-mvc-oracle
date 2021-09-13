package shop.tripn.oracle.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.tripn.oracle.order.domain.OrderDto;
import shop.tripn.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired OrderService orderService;
	@Autowired OrderDto order;
	@RequestMapping(value="/order", method= {RequestMethod.POST})
	public String order(
			@RequestParam("orderId") int orderId,
			@RequestParam("custId") int custId,
			@RequestParam("bookId") int bookId,
			@RequestParam("orderPrice") int orderPrice,
			@RequestParam("orderDate") String orderDate) {
		System.out.println("orderId : "+orderId);
		System.out.println("custId : "+custId);
		System.out.println("bookId : "+bookId);
		System.out.println("orderPrice : "+orderPrice);
		System.out.println("orderDate : "+orderDate);
//		order = new OrderDto();
		order.setOrderId(orderId);
		order.setCustId(custId);
		order.setBookId(bookId);
		order.setOrderPrice(orderPrice);
		order.setOrderDate(orderDate);
		orderService.save(order);
		return "order/order";
	}
	@RequestMapping("/orders")
	public void findAll () {
		List<OrderDto> orders = orderService.findAll();
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
	@RequestMapping("/orders/{orderId}")
	public void findOrderId(@PathVariable int orderId) {
		List<OrderDto> orders = orderService.findOrderId(orderId);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
	@RequestMapping("/orders/{custId}")
	public void findCustId(@PathVariable int custId) {
		List<OrderDto> orders = orderService.findCustId(custId);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
	@RequestMapping("/orders/{bookId}")
	public void findBookId(@PathVariable int bookId) {
		List<OrderDto> orders = orderService.findBookId(bookId);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
	@RequestMapping("/orders/{orderPrice}")
	public void findOrderPrice(@PathVariable int orderPrice) {
		List<OrderDto> orders = orderService.findOrderPrice(orderPrice);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
	@RequestMapping("/orders/{orderDate}")
	public void findOrderDate(@PathVariable String orderDate) {
		List<OrderDto> orders = orderService.findOrderDate(orderDate);
		for(OrderDto order : orders) {
			System.out.println(order.toString());
		}
	}
}
