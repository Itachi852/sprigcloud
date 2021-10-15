package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PayMentDao;
import com.atguigu.springcloud.entities.PayMent;
import com.atguigu.springcloud.service.PayMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayMentServiceImpl implements PayMentService {
    @Autowired
    private PayMentDao payMentDao;

    @Override
    public int add(PayMent payMent) {
        return payMentDao.add(payMent);
    }

    @Override
    public PayMent getPaymentById(Integer id) {
        return payMentDao.getPaymentById(id);
    }
}
