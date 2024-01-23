package com.project2.springboot.tutorial.service;

import com.project2.springboot.tutorial.entity.department;
import com.project2.springboot.tutorial.error.departmentNotFoundException;

import java.util.List;

public interface departmentService {
    public department saveDepartment(department dp);

    public List<department> fetchDepartment();

    public department fetchDepartmentByID(Long departmentId) throws departmentNotFoundException;

    public void deleteDepartmentByID(Long departmentId);

    public department updateDepartment(Long departmentId, department dp);

    public department fetchDepartmentByDepartmentName(String departmentName);
}
