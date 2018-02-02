package com.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
public class FootCheck {
    private int f_no;
    private int fnum;//数量
    //一个购物车对应多个食品
    private List<Foot> fcs=new ArrayList<Foot>();


    public FootCheck() {
    }

    public FootCheck(int f_no, int fnum) {
        this.f_no = f_no;
        this.fnum = fnum;
    }

    public int getf_no() {
        return f_no;
    }

    public void setf_no(int f_no) {
        this.f_no = f_no;
    }

    public int getFnum() {
        return fnum;
    }

    public void setFnum(int fnum) {
        this.fnum = fnum;
    }

    public List<Foot> getFcs() {
        return fcs;
    }

    public void setFcs(List<Foot> fcs) {
        this.fcs = fcs;
    }
}
