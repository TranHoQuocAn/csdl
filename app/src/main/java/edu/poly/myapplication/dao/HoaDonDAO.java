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
import edu.poly.myapplication.model.HoaDon;

public class HoaDonDAO {
    DbHepler dbHepler;
    public HoaDonDAO(Context context){
        dbHepler = new DbHepler(context);
    }

    public ArrayList<HoaDon> getDSDau(){
        @SuppressLint("SimpleDateFormat") SimpleDateFormat spf = new SimpleDateFormat("yyyy:MM:dd-HH:mm:ss");
        ArrayList<HoaDon> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHepler.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM HOADON",null);
        if (cursor.getCount() != 0){
            cursor.moveToFirst();
            do {
                try {
                    list.add(new HoaDon(cursor.getInt(0), cursor.getInt(1), cursor.getInt(2), spf.parse(cursor.getString(3)), spf.parse(cursor.getString(4))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }while (cursor.moveToNext());
        }

        return list;
    }

}
