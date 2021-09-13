package shop.tripn.oracle.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.mappers.OrderMapper;
import shop.tripn.oracle.order.domain.OrderDto;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired OrderMapper orderMapper;
	@Override
	public List<OrderDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDto> findOrderId(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDto> findCustId(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDto> findBookId(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDto> findOrderPrice(int orderPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDto> findOrderDate(String orderDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(OrderDto order) {
		// TODO Auto-generated method stub
		orderMapper.save(order);
	}

	

}
