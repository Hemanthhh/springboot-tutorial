package com.hemanth.springboot.tutorial.service;

import com.hemanth.springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDeparment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);
}
