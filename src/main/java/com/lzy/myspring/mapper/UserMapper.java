package com.lzy.myspring.mapper;

import com.lzy.myspring.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * @title UserMapper
 * @description
 * @author lzy.tl
 * @createTime 2022/10/8 17:17:48
 **/
@Repository
//@Mapper
public interface UserMapper {
    List<User> getAllUser();
}
