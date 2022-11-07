package edu.poly.myapplication.dao;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import edu.poly.myapplication.database.DbHepler;
import edu.poly.myapplication.model.HangHoa;
import edu.poly.myapplication.model.HoaDonChiTiet;

public class HoaDonChiTietDAO {
    @SuppressLint("SimpleDateFormat")
    SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
    DbHepler dbHepler;
    public HoaDonChiTietDAO(Context context){
        dbHepler = new DbHepler(context);
    }

    public ArrayList<HoaDonChiTiet> getDSDau() throws ParseException {
        ArrayList<HoaDonChiTiet> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHepler.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM HOADONCHITIET",null);
        if (cursor.getCount() != 0){
            cursor.moveToFirst();
            do {
                list.add(new HoaDonChiTiet(cursor.getInt(0), cursor.getInt(1), cursor.getInt(2), cursor.getInt(3), cursor.getInt(4), cursor.getString(5), spf.parse(cursor.getString(6))));
            }while (cursor.moveToNext());
        }

        return list;
    }
}
