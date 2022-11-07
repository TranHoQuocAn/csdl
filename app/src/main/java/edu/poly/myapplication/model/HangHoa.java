package edu.poly.myapplication.model;

public class HangHoa {
    private int maHangHoa;
    private String  avata;
    private String tenHangHoa;
    private int giaTien;
    private int maLoai;
    private int trangThai;

    public HangHoa(int maHangHoa, String avata, String tenHangHoa, int giaTien, int maLoai, int trangThai) {
        this.maHangHoa = maHangHoa;
        this.avata = avata;
        this.tenHangHoa = tenHangHoa;
        this.giaTien = giaTien;
        this.maLoai = maLoai;
        this.trangThai = trangThai;
    }

    public int getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(int maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public String getAvata() {
        return avata;
    }

    public void setAvata(String avata) {
        this.avata = avata;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public int getGiaTien() {
        return giaTien;
    }

    @Override
    public String toString() {
        return "HangHoa{" +
                "maHangHoa=" + maHangHoa +
                ", avata='" + avata + '\'' +
                ", tenHangHoa='" + tenHangHoa + '\'' +
                ", giaTien=" + giaTien +
                ", maLoai=" + maLoai +
                ", trangThai=" + trangThai +
                '}';
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }


}
