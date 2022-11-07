package edu.poly.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.text.ParseException;

import edu.poly.myapplication.dao.BanDAO;
import edu.poly.myapplication.dao.HangHoaDAO;
import edu.poly.myapplication.dao.HoaDonChiTietDAO;
import edu.poly.myapplication.dao.HoaDonDAO;
import edu.poly.myapplication.dao.LoaiHangDao;
import edu.poly.myapplication.dao.NguoiDungDAO;
import edu.poly.myapplication.model.Ban;
import edu.poly.myapplication.model.HangHoa;
import edu.poly.myapplication.model.HoaDon;
import edu.poly.myapplication.model.HoaDonChiTiet;
import edu.poly.myapplication.model.LoaiHang;
import edu.poly.myapplication.model.NguoiDung;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        HangHoaDAO hangHoaDAO  = new HangHoaDAO(this);
//        for (HangHoa hangHoa : hangHoaDAO.getDSDau()){
//            Log.i("TAG", "Danh sachs hangf hoa" + hangHoa.toString());
//        }
//        BanDAO banDAO = new BanDAO(this);
//        for (Ban ban : banDAO.getDSDau()){
//            Log.i("TAG", "Danh sach ban"+ban.toString());
//        }
//
//        HoaDonDAO hoaDonDAO = new HoaDonDAO(this);
//        for (HoaDon hoaDon : hoaDonDAO.getDSDau()){
//            Log.i("TAG", "DanhSachHoaDon: "+hoaDon.toString());
//        }
//
//        LoaiHangDao loaiHangDao = new LoaiHangDao(this);
//        for (LoaiHang loaiHang : loaiHangDao.getDSDau()){
//            Log.i("TAG", "DanhSachLoaiHang: "+loaiHang.toString());
//        }

//        NguoiDungDAO nguoiDungDAO = new NguoiDungDAO(this);
//        try {
//            for (NguoiDung nguoiDung : nguoiDungDAO.getDSDau()){
//                Log.i("TAG", "DanhSachNguoiDung: "+nguoiDung.toString());
//            }
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        HoaDonChiTietDAO hoaDonChiTietDAO = new HoaDonChiTietDAO(this);
        try {
            for (HoaDonChiTiet hoaDonChiTiet : hoaDonChiTietDAO.getDSDau()){
                Log.i("TAG", "DanhSachHDCT: "+hoaDonChiTiet.toString());
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }




    }
}