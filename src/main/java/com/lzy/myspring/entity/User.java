package com.lzy.myspring.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * @title User
 * @description
 * @author lzy.tl
 * @createTime 2022/10/8 17:04:32
 **/
@Data
@Table(name = "User")
public class User {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private String sex;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "dptid")
    private Integer dptid;

    @Column(name = "status")
    private Integer status;

}
