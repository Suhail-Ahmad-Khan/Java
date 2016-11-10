package org.packt.Spring.chapter2.service;

public class EmployeeServiceImpl implements EmployeeService {

	//@Override
	public long generateEmployeeId() {
		return System.currentTimeMillis();
	}
}
