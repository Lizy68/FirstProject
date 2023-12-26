package com.lzy.myspring.rest;

import com.lzy.myspring.biz.UserBiz;
import com.lzy.myspring.entity.User;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 * @title UserController
 * @description
 * @author lzy.tl
 * @createTime 2022/10/8 17:12:18
 **/
@RestController
@RequestMapping("user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserBiz userBiz;

    @RequestMapping(value = "/vue-element-admin/login", method = RequestMethod.POST)
    public Boolean login() {
        return true;
    }

    @RequestMapping(value = "/vue-element-admin/info", method = RequestMethod.GET)
    public Boolean getInfo() {
        return true;
    }

    @ApiOperation("分页获取数据")
    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userBiz.getAllUser();
    }

}
