package com.yuan.controller;

import com.yuan.bean.CommonResult;
import com.yuan.bean.Configrution;
import com.yuan.bean.Pojo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class ConsumerServlet {

    private static final String ADDRESS =  "http://provider-service/";
    @Resource
    private Configrution configrution;
    @RequestMapping("consumer/find")
    @ResponseBody
    public CommonResult find(){
        return configrution.getRest().getForObject(ADDRESS+"/findAll",CommonResult.class);
    }
    @PostMapping(value = "/consumer/add")
    @ResponseBody
    public CommonResult add(Pojo pojo){
        System.out.println(pojo.toString());
        return configrution.getRest().postForObject(ADDRESS+"/add",pojo,CommonResult.class);
    }

}
