package cn.bdqn.sptdemo.dao;

import cn.bdqn.sptdemo.base.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Select("select khmc_id id,khmc_name name from khmc")
    public List<User> getAll();
}
