package com.yuan.controller;

import com.yuan.bean.CommonResult;
import com.yuan.serviceFeign.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OderFeignController {
    @Resource
    private FeignService feignService;

    @GetMapping("consumer/findFeign")
    public CommonResult find(){
        return feignService.findManager();
    }

}
