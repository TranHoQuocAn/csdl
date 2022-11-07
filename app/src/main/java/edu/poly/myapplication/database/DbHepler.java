package edu.poly.myapplication.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHepler extends SQLiteOpenHelper {

    public DbHepler(Context context){
        super(context, "APTCOFFEE",null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String dbBan = "CREATE TABLE BAN(maBan INTEGER PRIMARY KEY AUTOINCREMENT, trangThai INTEGER NOT NULL)";
        sqLiteDatabase.execSQL(dbBan);
        String dbLoaiHang = "CREATE TABLE LOAIHANG(maLoai INTEGER PRIMARY KEY AUTOINCREMENT, tenLoai TEXT NOT NULL)";
        sqLiteDatabase.execSQL(dbLoaiHang);
        String dbNguoiDung = "CREATE TABLE NGUOIDUNG(maNguoiDung INTEGER PRIMARY KEY AUTOINCREMENT,hoVaTen TEXT NOT NULL,avata TEXT,ngaySinh date NOT NULL,email TEXT NOT NULL,chucVu TEXT NOT NULL, gioiTinh TEXT NOT NULL,matKhau TEXT)";
        sqLiteDatabase.execSQL(dbNguoiDung);
        String dbHoaDon = "CREATE TABLE HOADON(maHoaDon INTEGER PRIMARY KEY AUTOINCREMENT,maBan INTEGER REFERENCES BAN(maBan),maNguoiDung INTEGER REFERENCES NGUOIDUNG(maNguoiDung),gioVao DATE NOT NULL,gioRa DATE NOT NULL)";
        sqLiteDatabase.execSQL(dbHoaDon);
        String dbHoaDonChiTiet = "CREATE TABLE HOADONCHITIET(maHDCT INTEGER PRIMARY KEY AUTOINCREMENT,maHoaDon INTEGER REFERENCES HOADON(maHoaDon),maHangHoa INTEGER REFERENCES HANGHOA(maHangHoa),soLuong INTEGER NOT NULL,giaTien INTEGER NOT NULL,ghiChu TEXT,ngayXuatHoaDon DATE NOT NULL)";
        sqLiteDatabase.execSQL(dbHoaDonChiTiet);
        String dbHangHoa = "CREATE TABLE HANGHOA(maHangHoa INTEGER PRIMARY KEY AUTOINCREMENT,avata TEXT,tenHangHoa TEXT NOT NULL,giaTien INTEGER NOT NULL,maLoai INTEGER REFERENCES LOAIHANG(maLoai),trangThai INTEGER NOT NULL)";
        sqLiteDatabase.execSQL(dbHangHoa);

        sqLiteDatabase.execSQL("INSERT INTO LOAIHANG VALUES(1, 'Cà phê Tây Nguyên'), (2,'Nước có ga'), (3,'Các loại hạt')");
        sqLiteDatabase.execSQL("INSERT INTO HANGHOA VALUES(1,'','Pessi',9000,2,1), (2,'','Coffee GL',900000,1,0), (3,'','Hạt điều',55000,3,0)");
        sqLiteDatabase.execSQL(("INSERT INTO BAN VALUES(1,0), (2,0), (3,1), (4,0)"));
        sqLiteDatabase.execSQL(("INSERT INTO NGUOIDUNG VALUES(1,'Trần Anh Lớn', '','2000-01-01','lonta@gmail.com','NhanVien','Nam','121212'), (2,'Trần Thị Hồng','','2002-02-02','hongtt@gmail.com','Admin','Nữ','212121')"));
        sqLiteDatabase.execSQL(("INSERT INTO HOADON VALUES(1, 1, 1, '2022:02:02-15:20:15', '2022:02:02-18:30:15'), (2, 4, 1, '2022:02:04-16:20:15', '2022:02:04-15:30:15') "));
        sqLiteDatabase.execSQL(("INSERT INTO HOADONCHITIET VALUES(1, 2, 2,3, '18000', 'nhiều sữa', '2022-02-04'), (2, 1, 1,2, '12000', 'ly da', '2022-02-02')"));


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        if (oldVersion != newVersion){
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS BAN");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS LOAIHANG");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS NGUOIDUNG");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS HOADON");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS HOADONCHITIET");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS HANGHOA");

            onCreate(sqLiteDatabase);
        }
    }
}
