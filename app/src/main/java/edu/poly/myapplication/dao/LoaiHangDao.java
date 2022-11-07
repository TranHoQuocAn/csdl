package edu.poly.myapplication.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import edu.poly.myapplication.database.DbHepler;
import edu.poly.myapplication.model.HangHoa;
import edu.poly.myapplication.model.LoaiHang;

public class LoaiHangDao {
    DbHepler dbHepler;
    public LoaiHangDao(Context context){
        dbHepler = new DbHepler(context);
    }
    public ArrayList<LoaiHang> getDSDau(){
        ArrayList<LoaiHang> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHepler.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM LOAIHANG", null);
        if (cursor.getCount() != 0){
            cursor.moveToFirst();
            do {
                list.add(new LoaiHang(cursor.getInt(0), cursor.getString(1)));
            }while (cursor.moveToNext());
        }
        return list;
    }
}
