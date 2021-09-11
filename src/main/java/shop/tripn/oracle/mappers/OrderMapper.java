package shop.tripn.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper {
	public List<OrderDto> findAll();
	public List<OrderDto> findOrderId(int orderId);
	public List<OrderDto> findCustId(int custId);
	public List<OrderDto> findBookId(int bookId);
	public List<OrderDto> findOrderPrice(int orderPrice);
	public List<OrderDto> findOrderDate(String orderDate);
}
