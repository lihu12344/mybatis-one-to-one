package com.example.demo.controller;

import com.example.demo.dao.PersonMapper;
import com.example.demo.pojo.PersonMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("/get")
    public List<PersonMap> get(){

        return personMapper.getAllPersonMap();
    }
}
