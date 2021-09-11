package shop.tripn.oracle.customer.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data@Component
public class CustomerDto {
	private int custId;
	private String custName;
	private int address;
	private int phone;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}
