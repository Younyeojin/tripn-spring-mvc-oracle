package shop.tripn.oracle.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.mappers.OrderMapper;
import shop.tripn.oracle.order.domain.OrderDto;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderMapper orderMapper;

	@Override
	public void save(OrderDto t) {
		// TODO Auto-generated method stub
		orderMapper.save(t);
	}

	@Override
	public OrderDto findById(Integer id) {
		// TODO Auto-generated method stub
		return orderMapper.findById(id);
	}

	@Override
	public List<OrderDto> findAll() {
		// TODO Auto-generated method stub
		return orderMapper.findAll();
	}

	@Override
	public void update(OrderDto t) {
		// TODO Auto-generated method stub
		orderMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		orderMapper.delete(id);
	}

	@Override
	public List<OrderDto> findByCustId(int custId) {
		// TODO Auto-generated method stub
		return orderMapper.findByCustId(custId);
	}

	@Override
	public List<OrderDto> findByBookId(int bookId) {
		// TODO Auto-generated method stub
		return orderMapper.findByBookId(bookId);
	}

	@Override
	public List<OrderDto> findByOrderPrice(String orderPrice) {
		// TODO Auto-generated method stub
		return orderMapper.findByOrderPrice(orderPrice);
	}

	@Override
	public List<OrderDto> findByOrderDate(String orderDate) {
		// TODO Auto-generated method stub
		return orderMapper.findByOrderDate(orderDate);
	}
	

}
