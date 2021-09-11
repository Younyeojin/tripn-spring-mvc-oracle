package shop.tripn.oracle.customer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.customer.domain.CustomerDto;

@Component
public interface CustomerService {
	public List<CustomerDto> findAll();
	public CustomerDto findCustId();
	public List<CustomerDto> findCustName();
	public List<CustomerDto> findAddress();
	public List<CustomerDto> findPhone();
}
