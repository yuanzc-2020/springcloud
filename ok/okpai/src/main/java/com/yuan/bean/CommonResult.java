package com.yuan.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)//set/get方法的返回值类型自定义
public class CommonResult {

    private Integer code;
    private String msg;
    private Object object;


    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", Result=" + object +
                '}';
    }


}
