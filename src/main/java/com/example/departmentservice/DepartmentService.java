package com.example.departmentservice;

public interface DepartmentService {
	
	Department saveDepartment(Department department);
	Department findDepartmentById(Long id);
}
