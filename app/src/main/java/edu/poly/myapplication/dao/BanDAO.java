package edu.poly.myapplication.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import edu.poly.myapplication.database.DbHepler;
import edu.poly.myapplication.model.Ban;
import edu.poly.myapplication.model.HangHoa;

public class BanDAO {
    DbHepler dbHepler;
    public BanDAO(Context context){
        dbHepler = new DbHepler(context);
    }

    public ArrayList<Ban> getDSDau(){
        ArrayList<Ban> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHepler.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM BAN",null);
        if (cursor.getCount() != 0){
            cursor.moveToFirst();
            do {
                list.add(new Ban(cursor.getInt(0), cursor.getInt(1)));
            }while (cursor.moveToNext());
        }

        return list;
    }
}
