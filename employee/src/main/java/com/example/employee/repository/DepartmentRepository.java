package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entity.Department;



public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
