package cn.bdqn.sptdemo.web2;

import cn.bdqn.sptdemo.base.pojo.User;
import cn.bdqn.sptdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("getUser")
    @ResponseBody
    public User getUser(){
        return new User(1000,"张三");
    }

    @RequestMapping("getUserAll")
    @ResponseBody
    public List<User> getUserAll(){
        return userService.getAll();
    }
}
