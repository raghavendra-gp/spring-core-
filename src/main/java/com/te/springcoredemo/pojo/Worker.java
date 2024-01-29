package com.te.springcoredemo.pojo;

import lombok.Data;

@Data
public class Worker {

	private int workId;
	private int workCode;

	public Worker(int workId, int workCode) {
		System.out.println("BY int");
		this.workId = workId;
		this.workCode = workCode;
	}

	public Worker(double workId, double workCode) {
		System.out.println("By double");
		this.workId = (int) workId;
		this.workCode = (int) workCode;
	}

	public Worker(int workId, String workCode) {
		System.out.println("By double");
		this.workId = workId;
		this.workCode = Integer.parseInt(workCode);
	}
}
