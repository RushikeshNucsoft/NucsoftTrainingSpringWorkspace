package com.employeegroupdepartment;

public class EmployeeDepartmentMappingRequest {
    private int empId;
    private int deptId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public EmployeeDepartmentMappingRequest(int empId, int deptId) {
		super();
		this.empId = empId;
		this.deptId = deptId;
	}
	public EmployeeDepartmentMappingRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}