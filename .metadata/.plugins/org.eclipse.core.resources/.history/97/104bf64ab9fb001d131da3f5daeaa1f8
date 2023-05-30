package com.example.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;
import com.example.employee.entity.EmployeeDepartmentMapping;
import com.example.employee.repository.DepartmentRepository;
import com.example.employee.repository.EmployeeDepartmentMappingRepository;
import com.example.employee.repository.EmployeeRepository;
import com.example.employeegroupdepartment.EmployeeDepartmentMappingRequest;
import com.example.employeegroupdepartment.EmployeeDepartmentResponse;



@RestController
@RequestMapping("/api/employees")
public class DepartmentController {
    private  EmployeeRepository employeeRepository;
    private EmployeeDepartmentMappingRepository mappingRepository;
    private DepartmentRepository departmentRepository;

    public DepartmentController(EmployeeRepository employeeRepository, EmployeeDepartmentMappingRepository mappingRepository, DepartmentRepository departmentRepository)
    {
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
