package com.service.impl;

import com.dao.ILoginDao;
import com.entity.Emp;
import com.service.ILoginService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/30 0030.
 */
@Service("loginService")
@Transactional(propagation = Propagation.REQUIRED)
public class LoginServiceImpl implements ILoginService {

    @Resource
    private ILoginDao loginDao;

    /**
     * 用户登录
     * @param no 员工编号
     * @param pwd 员工密码
     * @return 员工信息
     */
    @Override
    public Emp findEmp(int no,String pwd) {

        List<Emp> empList = loginDao.findEmpList();
        for (Emp emp:empList) {
            if(emp.getEno()==no && pwd.equals(emp.getEpwd())){
                return emp;
            }
        }
        return null;
    }

    public void setLoginDao(ILoginDao loginDao) {
        this.loginDao = loginDao;
    }
}
