package com.service;


import com.entity.Emp;

/**
 * Created by Administrator on 2018/1/30 0030.
 */

public interface ILoginService {

    //用户登录
    public Emp findEmp(int no,String pwd);

}
