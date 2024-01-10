package com.ty.bean;

public class DeptInfo  {
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "DeptInfo [department=" + department + "]";
	}
	
	

}
