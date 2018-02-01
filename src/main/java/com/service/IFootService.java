package com.service;

import com.entity.Foot;

import java.util.List;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
public interface IFootService {

    //添加食品
    public boolean addFoot(Foot foot);
    //查询食品
    public List footList();
    //根据名称查询食品
    public Foot findFootByName(String fname);
}
