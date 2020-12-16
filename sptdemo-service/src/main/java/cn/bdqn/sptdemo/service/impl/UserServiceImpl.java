package cn.bdqn.sptdemo.service.impl;

import cn.bdqn.sptdemo.base.pojo.User;
import cn.bdqn.sptdemo.dao.UserDao;
import cn.bdqn.sptdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public List<User> getAll(){
        return userDao.getAll();
    }
}
