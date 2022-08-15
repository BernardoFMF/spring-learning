package com.bernardofmf.springdemo.repository;

import com.bernardofmf.springdemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    /**
     * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
     */

    Department findByDepartmentName(String departmentName);
    Department findByDepartmentNameIgnoreCase(String departmentName);
}