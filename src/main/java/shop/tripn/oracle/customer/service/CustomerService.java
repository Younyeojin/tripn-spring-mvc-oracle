package shop.tripn.oracle.customer.service;

import java.util.List;

//import java.util.List;

import org.springframework.stereotype.Component;

import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.customer.domain.CustomerDto;

@Component
public interface CustomerService extends GenericInterface<CustomerDto, Integer> {
	public List<CustomerDto> findByCustName(String custName);
	public List<CustomerDto> findByAddress(String address);
	public List<CustomerDto> findByPhone(String phone);
}
