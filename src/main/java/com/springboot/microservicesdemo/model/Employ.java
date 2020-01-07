package com.springboot.microservicesdemo.model;

import java.util.Date;

public class Employ {
	private Integer employeeId;
	private String employeeName;
	private Date joiningDate;
	
	public Employ(int employeeId, String employeeName, Date joiningDate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.joiningDate = joiningDate;
	}

	
	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", joiningDate=" + joiningDate
				+ "]";
	}
	
}
