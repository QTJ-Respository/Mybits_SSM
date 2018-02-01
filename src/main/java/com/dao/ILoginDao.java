package com.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30 0030.
 */
public interface ILoginDao {

    @Select("select * from emp")
    @ResultMap("com.dao.ILoginDao.empMap")
    public List findEmpList();
}
