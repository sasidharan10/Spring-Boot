package com.project2.springboot.tutorial.repository;

import com.project2.springboot.tutorial.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface departmentRepository extends JpaRepository<department, Long> {
    public department findByDepartmentName(String dpName);

    public department findByDepartmentNameIgnoreCase(String dpName);

}
