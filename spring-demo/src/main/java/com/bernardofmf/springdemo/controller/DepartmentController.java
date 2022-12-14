package com.bernardofmf.springdemo.controller;

import com.bernardofmf.springdemo.entity.Department;
import com.bernardofmf.springdemo.error.DepartmentNotFoundException;
import com.bernardofmf.springdemo.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    /**
     * Using loggers for debugging
     */
    private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        logger.info("Inside saveDepartment of DepartmentController");
        return service.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return service.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId)
            throws DepartmentNotFoundException {
        return service.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        service.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        return service.updateDepartment(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
        return service.fetchDepartmentByName(departmentName);
    }
}
