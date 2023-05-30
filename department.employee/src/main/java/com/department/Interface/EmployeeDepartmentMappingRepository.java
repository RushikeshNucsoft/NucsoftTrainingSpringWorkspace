package com.department.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import department.employee.entity.EmployeeDepartmentMapping;

public interface EmployeeDepartmentMappingRepository extends JpaRepository<EmployeeDepartmentMapping, Integer> {
}
