package com.te.springcoredemo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoredemo.pojo.Worker;

public class WorkMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("work.xml");
		Worker worker = (Worker) factory.getBean("worker");
		System.out.println(worker);
	}
}
