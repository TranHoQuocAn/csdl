package edu.poly.myapplication.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import edu.poly.myapplication.database.DbHepler;
import edu.poly.myapplication.model.HangHoa;

public class HangHoaDAO {
    DbHepler dbHepler;
    public HangHoaDAO(Context context){
        dbHepler = new DbHepler(context);
    }

    public ArrayList<HangHoa> getDSDau(){
        ArrayList<HangHoa> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHepler.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM HANGHOA",null);
        if (cursor.getCount() != 0){
            cursor.moveToFirst();
            do {
                list.add(new HangHoa(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getInt(3), cursor.getInt(4), cursor.getInt(5)));
            }while (cursor.moveToNext());
        }

        return list;
    }
}
