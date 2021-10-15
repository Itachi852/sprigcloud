package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.PayMent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {
    public static final String PATMENT_URL="http://localhost:8081";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "/consumer/payment/add")
    public CommonResult<PayMent> add(PayMent payMent){
        return restTemplate.postForObject(PATMENT_URL+"/payment/add",payMent,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<PayMent> add(@PathVariable("id") Integer id){
        return restTemplate.getForObject(PATMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
