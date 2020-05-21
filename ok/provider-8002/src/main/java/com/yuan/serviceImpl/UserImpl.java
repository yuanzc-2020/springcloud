package com.yuan.serviceImpl;

import com.yuan.bean.Pojo;
import com.yuan.serviceFeign.UserDao;
import com.yuan.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public List<Pojo> findAll() {
        return userDao.findAll();
    }

    @Override
    public boolean add(Pojo pojo) {
        return userDao.add(pojo);
    }
}
