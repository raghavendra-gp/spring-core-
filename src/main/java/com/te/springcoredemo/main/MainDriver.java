package com.te.springcoredemo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoredemo.pojo.Employee;
import com.te.springcoredemo.pojo.Student;

public class MainDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

//		Downcasting from object to student

		Student student = context.getBean("student", Student.class);
		System.out.println(student);
//
//		Student student1 = context.getBean("student1", Student.class);
//		System.out.println(student1);

//		Employee employee = (Employee) context.getBean("employee");
//
//		System.out.println(employee);
//		employee.getEmpId();
//		employee.getEmpName();
	}
}
