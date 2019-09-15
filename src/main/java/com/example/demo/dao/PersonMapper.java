package com.example.demo.dao;

import com.example.demo.pojo.Person;
import com.example.demo.pojo.PersonMap;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PersonMapper extends Mapper<Person> {

    Person getById(@Param("id") Integer id);

    List<PersonMap> getAllPersonMap();
}
