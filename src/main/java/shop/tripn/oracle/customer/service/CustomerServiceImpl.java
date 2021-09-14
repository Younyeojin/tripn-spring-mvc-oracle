package shop.tripn.oracle.customer.service;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestMapping;

import shop.tripn.oracle.customer.domain.CustomerDto;
import shop.tripn.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper customerMapper;
	@Override
	public void save(CustomerDto t) {
		// TODO Auto-generated method stub
		customerMapper.save(t);
	}

	@Override
	public CustomerDto findById(Integer id) {
		// TODO Auto-generated method stub
		return customerMapper.findById(id);
	}

	@Override
	public List<CustomerDto> findAll() {
		// TODO Auto-generated method stub
		return customerMapper.findAll();
	}

	@Override
	public void update(CustomerDto t) {
		// TODO Auto-generated method stub
		customerMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		customerMapper.delete(id);
	}

	@Override
	public List<CustomerDto> findByCustName(String custName) {
		// TODO Auto-generated method stub
		return customerMapper.findByCustName(custName);
	}

	@Override
	public List<CustomerDto> findByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDto> findByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
