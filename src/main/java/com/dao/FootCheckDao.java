package com.dao;

import com.entity.Foot;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by Administrator on 2018/2/1 0001.
 */
public interface FootCheckDao {
    @Insert("insert into footcheck(fnum,ffno) values(#{num},#{foot.fno})")
    public boolean addF_C(int num, Foot foot);
}
