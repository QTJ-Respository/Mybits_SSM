package com.dao;

import com.entity.Foot;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
public interface FootDao {
    //添加食品
    @Insert("insert into foot(fname,fprice) values(#{fname},#{fprice})")
    public boolean addFoot(Foot foot);
    //查询食品
    @Select("select * from foot")
    @ResultMap("com.dao.FootDao.footMap")
    public List footList();
    //根据名称查询食品
    @Select("select * from foot where fname = #{fname}")
    public Foot findFootByName(String fname);
}
