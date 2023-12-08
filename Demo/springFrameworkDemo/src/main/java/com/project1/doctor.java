package com.project1;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class doctor implements staff, BeanNameAware {
//    private String qualification;

    // constructor injection
//    public doctor(String qualification) {
//        this.qualification = qualification;
//    }

//    private nurse ns;


    public void assist()
    {
        System.out.println("Doctor is assisting...");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName() is called...");
    }

    @PostConstruct
    public void postObjectCreation()
    {
        System.out.println("postObjectCreation() is called...");
    }

//    public String getQualification() {
//        return qualification;
//    }

//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }


//      Injecting object
//    public nurse getNs() {
//        return ns;
//    }
//
//    public void setNs(nurse ns) {
//        this.ns = ns;
//    }
}
