package com.yuan.service;


import com.yuan.bean.Pojo;

import java.util.List;

public interface UserService {

    public List<Pojo> findAll();

    public boolean add(Pojo pojo);
}
