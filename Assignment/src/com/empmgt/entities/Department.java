package com.empmgt.entities;

public class Department {
	private String deptid;
	private String deptname;
	
	public Department() {
	this("Null","Null");

	}

	public Department(String deptid,String deptname) {
		this.setDeptid(deptid);
		this.setDeptname(deptname);

	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;

	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

}
