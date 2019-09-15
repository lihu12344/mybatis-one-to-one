package com.example.demo.controller;

import com.example.demo.dao.CardMapper;
import com.example.demo.pojo.CardMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardMapper cardMapper;

    @RequestMapping("/get2")
    public List<CardMap> get2(){
        return cardMapper.getAllCardMap();
    }
}
