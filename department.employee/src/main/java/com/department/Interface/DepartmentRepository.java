package com.department.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import department.employee.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
