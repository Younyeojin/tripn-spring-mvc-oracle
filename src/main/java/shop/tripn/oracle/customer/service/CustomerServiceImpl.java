package shop.tripn.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper customerMapper;

	@Override
	public List<CustomerDto> findAll() {
		// TODO Auto-generated method stub
		return customerMapper.findAll();
	}

	@Override
	public CustomerDto findCustId() {
		// TODO Auto-generated method stub
		return customerMapper.findCustId();
	}

	@Override
	public List<CustomerDto> findCustName() {
		// TODO Auto-generated method stub
		return customerMapper.findCustName();
	}

	@Override
	public List<CustomerDto> findAddress() {
		// TODO Auto-generated method stub
		return customerMapper.findAddress();
	}

	@Override
	public List<CustomerDto> findPhone() {
		// TODO Auto-generated method stub
		return customerMapper.findPhone();
	}
	
}
