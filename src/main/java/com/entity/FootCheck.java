package com.entity;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
public class FootCheck {
    private int fno;
    private int fnum;//数量
    private Foot foot;//食物

    public FootCheck() {
    }

    public FootCheck(int fno, int fnum, Foot foot) {
        this.fno = fno;
        this.fnum = fnum;
        this.foot = foot;
    }

    public int getFno() {
        return fno;
    }

    public void setFno(int fno) {
        this.fno = fno;
    }

    public int getFnum() {
        return fnum;
    }

    public void setFnum(int fnum) {
        this.fnum = fnum;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }
}
