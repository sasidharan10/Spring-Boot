package com.project2.springboot.tutorial.controller;

import com.project2.springboot.tutorial.entity.department;
import com.project2.springboot.tutorial.error.departmentNotFoundException;
import com.project2.springboot.tutorial.service.departmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class departmentController {

    private final Logger LOGGER = LoggerFactory.getLogger(departmentController.class);
    @Autowired
    private departmentService dpService;
    @PostMapping("/departments")
    public department saveDepartment(@Valid @RequestBody department dp)
    {
        LOGGER.info("Save Department");
//        System.out.println("SOUT Statement");  // not recommended
        return dpService.saveDepartment(dp) ;
    }

    @GetMapping("/departments")
    public List<department> fetchDepartment()
    {
        LOGGER.info("Get Department");
        return dpService.fetchDepartment();
    }

    @GetMapping("/departments/{id}")
    public department fetchDepartmentByID(@PathVariable("id") Long departmentId) throws departmentNotFoundException {
        return dpService.fetchDepartmentByID(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentByID(@PathVariable("id") Long departmentId)
    {
        dpService.deleteDepartmentByID(departmentId);
        return "Successfully Deleted Department!!!";
    }

    @PutMapping("/departments/name/{id}")
    public department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody department dp)
    {
        return dpService.updateDepartment(departmentId, dp);
    }

    @GetMapping("/departments/name/{dpName}")
    public department fetchDepartmentByDepartmentName(@PathVariable("dpName") String departmentName)
    {
        return dpService.fetchDepartmentByDepartmentName(departmentName);
    }

}
