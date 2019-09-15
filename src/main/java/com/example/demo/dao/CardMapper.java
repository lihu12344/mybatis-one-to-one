package com.example.demo.dao;

import com.example.demo.pojo.Card;
import com.example.demo.pojo.CardMap;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CardMapper extends Mapper<Card> {

    Card getById(@Param("id") Integer id);

    List<CardMap> getAllCardMap();
}
