package com.yuan.controller;

import com.yuan.bean.CommonResult;
import com.yuan.bean.Pojo;
import com.yuan.service.UserService;
import com.yuan.serviceImpl.UserImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/findAll")
    @ResponseBody
    public CommonResult findManager(){

        return new CommonResult(200,serverPort,userService.findAll());
    }
    @PostMapping("/add")
    public CommonResult add(Pojo pojo){

            boolean a = userService.add(pojo);
           return new CommonResult(200,serverPort,a);

    }
}
