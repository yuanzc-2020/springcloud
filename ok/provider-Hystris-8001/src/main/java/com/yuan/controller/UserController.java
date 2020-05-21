package com.yuan.controller;


import com.yuan.bean.CommonResult;
import com.yuan.bean.Pojo;
import com.yuan.service.UserService;
import com.yuan.serviceImpl.UserImpl;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @Value("${server.port}")
    private String serverPort;
    @Resource
    private DiscoveryClient ds;

    @RequestMapping(value = "/findAll")
    public CommonResult findManager(){

        return new CommonResult(200,serverPort,userService.findAll());
    }
    @PostMapping("/add")
    public CommonResult add(Pojo pojo){

        boolean a = userService.add(pojo);
        return new CommonResult(200,serverPort,a);
    }
    @GetMapping("discovery/getMsg")
    public Object discovery(){
        Logger log= LoggerFactory.getLogger(getClass());
      List<String> lis  =   ds.getServices();
        for (String s: lis) {
            log.info(s);

        }
        List<ServiceInstance> lsit = ds.getInstances("PROVIDER-SERVICE");
        for (ServiceInstance s: lsit) {
           log.info(s.getServiceId()+"/t"+s.getHost()+"/t"+s.getPort()+"/t"+s.getUri());
        }
        return this.ds;
    }
}
