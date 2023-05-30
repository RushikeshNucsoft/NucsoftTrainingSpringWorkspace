package com.example.employee.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empdepmapping")
public class EmployeeDepartmentMapping {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "empId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "deptId")
    private Department department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public EmployeeDepartmentMapping(int id, Employee employee, Department department) {
		super();
		this.id = id;
		this.employee = employee;
		this.department = department;
	}

	public EmployeeDepartmentMapping() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Constructors, getters, and setters
}