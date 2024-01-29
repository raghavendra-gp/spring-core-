package com.te.springcoredemo.pojo;

import lombok.Data;

@Data
public class Employee {

	private int empId;
	private String empName;
//	private List<Address> address; 
	private Address address;

	public Employee(Address address) {
		this.address = address;
	}

}
