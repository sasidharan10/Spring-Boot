package com.project2.springboot.tutorial.service;

import com.project2.springboot.tutorial.entity.department;
import com.project2.springboot.tutorial.error.departmentNotFoundException;
import com.project2.springboot.tutorial.repository.departmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class departmentServiceImpl implements departmentService {

    @Autowired
    private departmentRepository dpRepository;
    @Override
    public department saveDepartment(department dp) {
        return dpRepository.save(dp);
    }

    @Override
    public List<department> fetchDepartment() {
        return dpRepository.findAll();
    }

    @Override
    public department fetchDepartmentByID(Long departmentId) throws departmentNotFoundException {

        Optional<department> dpt =  dpRepository.findById(departmentId);
        if(!dpt.isPresent())
        {
            throw new departmentNotFoundException("Department Not Found");
        }
        return dpt.get();

    }

    @Override
    public void deleteDepartmentByID(Long departmentId) {
        dpRepository.deleteById(departmentId);
    }

    @Override
    public department updateDepartment(Long departmentId, department dp) {
        department getDp = dpRepository.findById(departmentId).get();

        if(Objects.nonNull(dp.getDepartmentName()) && !"".equalsIgnoreCase(dp.getDepartmentName()))
        {
            getDp.setDepartmentName(dp.getDepartmentName());
        }

        if(Objects.nonNull(dp.getDepartmentCode()) && !"".equalsIgnoreCase(dp.getDepartmentCode()))
        {
            getDp.setDepartmentCode(dp.getDepartmentCode());
        }

        if(Objects.nonNull(dp.getDepartmentAddress()) && !"".equalsIgnoreCase(dp.getDepartmentAddress()))
        {
            getDp.setDepartmentAddress(dp.getDepartmentAddress());
        }

        return dpRepository.save(getDp);
    }

    @Override
    public department fetchDepartmentByDepartmentName(String departmentName) {
        return dpRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
