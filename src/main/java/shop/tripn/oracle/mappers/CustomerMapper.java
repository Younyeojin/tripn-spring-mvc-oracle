package shop.tripn.oracle.mappers;

import java.util.List;

//import java.util.List;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.common.GenericInterface;
import shop.tripn.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDto, Integer> {
	public List<CustomerDto> findByCustName(String custName);
	public List<CustomerDto> findByAddress(String address);
	public List<CustomerDto> findByPhone(String phone);
}
