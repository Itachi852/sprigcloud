package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.PayMent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface PayMentDao {

    int add(PayMent payMent);
    PayMent getPaymentById(@Param("id") Integer id);
}
