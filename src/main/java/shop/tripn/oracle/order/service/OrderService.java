package shop.tripn.oracle.order.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.order.domain.OrderDto;

@Component
public interface OrderService {
	public List<OrderDto> findAll();
	public List<OrderDto> findOrderId(int orderId);
	public List<OrderDto> findCustId(int custId);
	public List<OrderDto> findBookId(int bookId);
	public List<OrderDto> findOrderPrice(int orderPrice);
	public List<OrderDto> findOrderDate(String orderDate);
	public void save(OrderDto order);
}
