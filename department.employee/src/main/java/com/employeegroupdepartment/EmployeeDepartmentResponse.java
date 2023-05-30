package com.employeegroupdepartment;

public class EmployeeDepartmentResponse {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;
    
    
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public EmployeeDepartmentResponse(int empId, String empName, int deptId, String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public EmployeeDepartmentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	
   
}