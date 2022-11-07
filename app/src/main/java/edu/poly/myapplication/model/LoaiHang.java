package edu.poly.myapplication.model;

public class LoaiHang {
    private int maLoai;
    private String tenLoai;

    @Override
    public String toString() {
        return "LoaiHang{" +
                "maLoai=" + maLoai +
                ", tenLoai='" + tenLoai + '\'' +
                '}';
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public LoaiHang(int maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }
}
