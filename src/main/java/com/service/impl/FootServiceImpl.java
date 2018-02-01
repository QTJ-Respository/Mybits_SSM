package com.service.impl;

import com.dao.FootDao;
import com.entity.Foot;
import com.service.IFootService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
@Service("footService")
@Transactional(propagation = Propagation.REQUIRED)
public class FootServiceImpl implements IFootService {
    @Resource
    private FootDao footDao;

    @Override
    public boolean addFoot(Foot foot) {
        return footDao.addFoot(foot);
    }

    @Override
    public List footList() {
        return footDao.footList();
    }

    @Override
    public Foot findFootByName(String fname) {
        return footDao.findFootByName(fname);
    }

    public void setFootDao(FootDao footDao) {
        this.footDao = footDao;
    }
}
