package com.entity;

/**
 * Created by Administrator on 2018/1/30 0030.
 */
public class Emp {

    //工号
    private int eno;
    //工名
    private String ename;
    //密码
    private String epwd;
    //人物类型：员工，管理员，经理
    private String etype;

    public Emp() {
    }

    public Emp(int eno, String ename, String epwd, String etype) {
        this.eno = eno;
        this.ename = ename;
        this.epwd = epwd;
        this.etype = etype;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEpwd() {
        return epwd;
    }

    public void setEpwd(String epwd) {
        this.epwd = epwd;
    }

    public String getEtype() {
        return etype;
    }

    public void setEtype(String etype) {
        this.etype = etype;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
