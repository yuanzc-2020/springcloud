package com.yuan.serviceFeign;

import com.yuan.bean.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER-SERVICE")
@Component
public interface FeignService {
    @GetMapping(value = "/findAll")
    public CommonResult findManager();

}
