package com.ctrip.personal.springboot.dubbotest.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ctrip.personal.springboot.dubbotest.service.BaseService;


@Service(version = "1.0.0")
public class BaseServiceImpl implements BaseService{

    @Override
    public String hello(String message) {
        return message;
    }
}
