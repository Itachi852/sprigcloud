package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.PayMent;
import com.atguigu.springcloud.service.PayMentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PayMentController {

    @Autowired
    private PayMentService payMentService;

    @PostMapping(value = "/payment/add")
    public CommonResult add(@RequestBody PayMent payMent){
        int result=payMentService.add(payMent);
        if (result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<PayMent> getPayMentById(@PathVariable("id") Integer id){
        PayMent result=payMentService.getPaymentById(id);
        if (result!=null){
            return new CommonResult(200,"查询成功",result);
        }else {
            return new CommonResult(444,"未找到数据",null);
        }

    }
}
