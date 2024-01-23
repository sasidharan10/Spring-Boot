package com.project2.springboot.tutorial.service;

import com.project2.springboot.tutorial.entity.department;
import com.project2.springboot.tutorial.repository.departmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class departmentServiceImplTest {

    @Autowired
    private departmentService dps;
    @MockBean
    private departmentRepository dpRepository;

    @BeforeEach
    void setUp() {
        department dpt =
                department.builder().departmentName("IT")
                .departmentAddress("Bangalore")
                .departmentCode("IT04")
                .departmentId(1L).build();

        Mockito.when(dpRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(dpt);

    }

    @Test
    @DisplayName("Get Data Based on Department name")
//    @Disabled  // to disable test case
    public void whenValidDepartName_thenDepartmentShouldFound()
    {
    String deptName = "IT";
    department found = dps.fetchDepartmentByDepartmentName(deptName);
        assertEquals(deptName, found.getDepartmentName());
    }

}