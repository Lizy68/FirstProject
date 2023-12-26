package com.lzy.myspring.biz;

import com.lzy.myspring.entity.User;
import com.lzy.myspring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @title UserBiz
 * @description
 * @author lzy.tl
 * @createTime 2022/10/8 17:15:17
 **/
@Service
public class UserBiz {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
