package com.employee.department.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.Interface.DepartmentRepository;
import com.department.Interface.EmployeeDepartmentMappingRepository;
import com.department.Interface.EmployeeRepository;
import com.employeegroupdepartment.EmployeeDepartmentMappingRequest;
import com.employeegroupdepartment.EmployeeDepartmentResponse;

import department.employee.entity.Department;
import department.employee.entity.Employee;
import department.employee.entity.EmployeeDepartmentMapping;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    private final EmployeeDepartmentMappingRepository mappingRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeController(EmployeeRepository employeeRepository, EmployeeDepartmentMappingRepository mappingRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.mappingRepository = mappingRepository;
        this.departmentRepository = departmentRepository;
    }

    @PostMapping("/assigndepartment")
    public ResponseEntity<String> assignEmployeeToDepartment(@RequestBody EmployeeDepartmentMappingRequest request) {
        Employee employee = employeeRepository.findById(request.getEmpId()).orElse(null);
        Department department = departmentRepository.findById(request.getDeptId()).orElse(null);

        if (employee == null || department == null) {
            return ResponseEntity.badRequest().body("Invalid employee or department ID.");
        }

        EmployeeDepartmentMapping mapping = new EmployeeDepartmentMapping();
        mapping.setEmployee(employee);
        mapping.setDepartment(department);
        mappingRepository.save(mapping);

        return ResponseEntity.ok("Employee assigned to department successfully.");
    }

    @GetMapping
    public List<EmployeeDepartmentResponse> listEmployeesWithDepartments() {
        List<EmployeeDepartmentMapping> mappings = mappingRepository.findAll();
        List<EmployeeDepartmentResponse> responses = new ArrayList<>();

        for (EmployeeDepartmentMapping mapping : mappings) {
            Employee employee = mapping.getEmployee();
            Department department = mapping.getDepartment();

            EmployeeDepartmentResponse response = new EmployeeDepartmentResponse(
                    employee.getId(), employee.getName(), department.getId(), department.getName());
            responses.add(response);
        }

        return responses;
    }
}
