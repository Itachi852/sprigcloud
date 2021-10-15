package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.PayMent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface PayMentService {

    int add(PayMent payMent);
    PayMent getPaymentById(@Param("id") Integer id);
}
