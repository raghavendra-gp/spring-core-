package com.te.springcoredemo.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Student {

	private int stuId;
	private String stuName;
	
	@Autowired
	private Address address;

}
