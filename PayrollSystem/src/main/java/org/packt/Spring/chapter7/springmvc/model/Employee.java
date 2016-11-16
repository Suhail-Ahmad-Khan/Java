package org.packt.Spring.chapter7.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_INFO")
public class Employee {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "JOB_TITLE")
	private String jobTitle;
	@Column(name = "DEPARTMENT")
	private String department;
	@Column(name = "SALARY")
	private int salary;

	// constructor and setter and getter
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee employee = (Employee) obj;
		if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int hashCode() {
		return firstName != null ? firstName.hashCode() : 0;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + firstName + "" + lastName + ", jobTitle=" + jobTitle + " department="
				+ department + " salary=" + salary + "]";
	}
}