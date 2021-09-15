package shop.tripn.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.order.domain.OrderDto;

@Repository
public interface OrderMapper extends GenericInterface<OrderDto,Integer> {
	public List<OrderDto> findByCustId(int custId);
	public List<OrderDto> findByBookId(int bookId);
	public List<OrderDto> findByOrderPrice(String orderPrice);
	public List<OrderDto> findByOrderDate(String orderDate);

}
