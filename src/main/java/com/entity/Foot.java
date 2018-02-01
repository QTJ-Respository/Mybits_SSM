package com.entity;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
public class Foot {

    private int fno;
    private String fname;
    private double fprice;

    public Foot() {
    }

    public Foot(int fno, String fname, double fprice) {
        this.fno = fno;
        this.fname = fname;
        this.fprice = fprice;
    }

    public int getFno() {
        return fno;
    }

    public void setFno(int fno) {
        this.fno = fno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public double getFprice() {
        return fprice;
    }

    public void setFprice(double fprice) {
        this.fprice = fprice;
    }
}
