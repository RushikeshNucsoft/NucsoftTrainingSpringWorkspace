package com.employee.department.mapping.repository;


import com.employee.department.mapping.entity.Department;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    
	 List<Department> findByNameContaining(String name);
	 
	 Optional<Department> findByName(String name);
}