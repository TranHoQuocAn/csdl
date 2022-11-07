package edu.poly.myapplication.model;

import java.util.Date;

public class HoaDon {
    private int maHoaDon;
    private int maBan;
    private int maNguoiDung;
    private Date gioVao;
    private Date gioRa;

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon=" + maHoaDon +
                ", maBan=" + maBan +
                ", maNguoiDung=" + maNguoiDung +
                ", gioVao=" + gioVao +
                ", gioRa=" + gioRa +
                '}';
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaBan() {
        return maBan;
    }

    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    public int getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(int maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public Date getGioVao() {
        return gioVao;
    }

    public void setGioVao(Date gioVao) {
        this.gioVao = gioVao;
    }

    public Date getGioRa() {
        return gioRa;
    }

    public void setGioRa(Date gioRa) {
        this.gioRa = gioRa;
    }

    public HoaDon(int maHoaDon, int maBan, int maNguoiDung, Date gioVao, Date gioRa) {
        this.maHoaDon = maHoaDon;
        this.maBan = maBan;
        this.maNguoiDung = maNguoiDung;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }
}
