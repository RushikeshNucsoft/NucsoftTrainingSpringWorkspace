package com.employee.department.mapping.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.department.mapping.entity.*;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	 List<Employee> findByDepartmentId(Integer postId);
	
	List<Employee> findByDepartmentName(String departmentName);
	
}
