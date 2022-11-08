package edu.poly.myapplication.model;

import java.util.Date;

public class NguoiDung {
    private int maNguoiDung;
    private String hoVaTen;
    private String avata;
    private Date ngaySinh;
    private String email;g
    private String chucVu;
    private String gioiTinh;
    private String matKhau;

    @Override
    public String toString() {
        return "NguoiDung{" +
                "maNguoiDung=" + maNguoiDung +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", avata='" + avata + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", email='" + email + '\'' +
                ", chucVu='" + chucVu + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", matKhau='" + matKhau + '\'' +
                '}';
    }

    public int getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(int maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getAvata() {
        return avata;
    }

    public void setAvata(String avata) {
        this.avata = avata;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public NguoiDung(int maNguoiDung, String hoVaTen, String avata, Date ngaySinh, String email, String chucVu, String gioiTinh, String matKhau) {
        this.maNguoiDung = maNguoiDung;
        this.hoVaTen = hoVaTen;
        this.avata = avata;
        this.ngaySinh = ngaySinh;
        this.email = email;
        this.chucVu = chucVu;
        this.gioiTinh = gioiTinh;
        this.matKhau = matKhau;
    }
}
