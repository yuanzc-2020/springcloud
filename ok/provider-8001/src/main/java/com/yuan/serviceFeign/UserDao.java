package com.yuan.serviceFeign;

import com.yuan.bean.Pojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public List<Pojo> findAll();

    public boolean add(Pojo pojo);

}
