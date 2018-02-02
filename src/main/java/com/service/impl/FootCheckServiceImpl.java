package com.service.impl;

import com.dao.FootCheckDao;
import com.entity.Foot;
import com.service.IFootCheckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/2/1 0001.
 */
@Service("footCheckService")
public class FootCheckServiceImpl implements IFootCheckService {

    @Resource
    private FootCheckDao checkDao;
    @Override
    public boolean addF_C(int num,Foot foot) {
        return checkDao.addF_C(num,foot);
    }

    public void setCheckDao(FootCheckDao checkDao) {
        this.checkDao = checkDao;
    }
}
