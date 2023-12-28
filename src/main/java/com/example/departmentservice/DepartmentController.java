package com.example.departmentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping
	public ResponseEntity<Department> saveDepartment(@RequestBody Department dept){
		Department department = departmentService.saveDepartment(dept);
		return new ResponseEntity<>(department, HttpStatus.CREATED);
	}
	
	@RequestMapping("{id}")
	public ResponseEntity<Department> findDepartmentById(@PathVariable Long id){
		Department department = departmentService.findDepartmentById(id);
		return new ResponseEntity<>(department, HttpStatus.OK);
	}
}
