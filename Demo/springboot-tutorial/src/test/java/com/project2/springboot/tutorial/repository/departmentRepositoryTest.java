package com.project2.springboot.tutorial.repository;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class departmentRepositoryTest {

    @Autowired
    private departmentRepository dpRepository;

    @BeforeEach
    void setUp() {
    }
}