package shop.tripn.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.tripn.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper {
	public List<CustomerDto> findAll();
	public CustomerDto findCustId();
	public List<CustomerDto> findCustName();
	public List<CustomerDto> findAddress();
	public List<CustomerDto> findPhone();


}
