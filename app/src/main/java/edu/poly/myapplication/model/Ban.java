package edu.poly.myapplication.model;

public class Ban {
    private int maBan;
    private int trangThai;

    public int getMaBan() {
        return maBan;
    }

    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Ban(int maBan, int trangThai) {
        this.maBan = maBan;
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Ban{" +
                "maBan=" + maBan +
                ", trangThai=" + trangThai +
                '}';
    }
}
