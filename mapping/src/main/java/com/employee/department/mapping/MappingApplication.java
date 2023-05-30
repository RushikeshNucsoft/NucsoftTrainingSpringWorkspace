package com.employee.department.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.employee.department.mapping.entity")
public class MappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}

}
