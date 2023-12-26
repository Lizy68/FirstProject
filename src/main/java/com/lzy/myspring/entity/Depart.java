package com.lzy.myspring.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

/***
 * @title Depart
 * @description
 * @author lzy.tl
 * @createTime 2022/10/8 17:04:41
 **/
@Data
public class Depart {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private Integer level;

    @Column(name = "preLevel")
    private Integer preLevel;
}
