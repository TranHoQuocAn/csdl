package edu.poly.myapplication.dao;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import edu.poly.myapplication.database.DbHepler;
import edu.poly.myapplication.model.HoaDonChiTiet;
import edu.poly.myapplication.model.NguoiDung;

public class NguoiDungDAO {
    @SuppressLint("SimpleDateFormat")
    SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
    DbHepler dbHepler;
    public NguoiDungDAO(Context context){
        dbHepler = new DbHepler(context);
    }
    public ArrayList<NguoiDung> getDSDau() throws ParseException {
        ArrayList<NguoiDung> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHepler.getReadableDatabase();
        @SuppressLint("Recycle") Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM NGUOIDUNG",null);
        if (cursor.getCount() != 0){
            cursor.moveToFirst();
            do {
                list.add(new NguoiDung(cursor.getInt(0), cursor.getString(1), cursor.getString(2), spf.parse(cursor.getString(3)), cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7)));
            }while (cursor.moveToNext());
        }
        return list;
    }
}
