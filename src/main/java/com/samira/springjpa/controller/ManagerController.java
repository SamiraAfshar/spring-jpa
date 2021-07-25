package com.samira.springjpa.controller;

import com.samira.springjpa.entity.Manager;
import com.samira.springjpa.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManagerController {

    @Autowired
    ManagerRepository managerRepository;

    @GetMapping("api/manager")
    public List<Manager> getAllManager(){
        return managerRepository.findAll();

    }
}
