package com.department.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import department.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
