package shop.tripn.oracle.customer.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper mapper;

	@Override
	public void save(CustomerDto customer) {
		// TODO Auto-generated method stub
		mapper.save(customer);
	}

	
	
}
