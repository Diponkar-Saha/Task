package com.diponnkar.task.adapter;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.diponnkar.task.model.Product;
import com.diponnkar.task.data.local.DBHelper;
import com.diponnkar.task.util.Constants;

import java.util.ArrayList;


public class DBAdapter {

    Context c;
    SQLiteDatabase db;
    DBHelper helper;


    public DBAdapter(Context c) {
        this.c = c;
        helper = new DBHelper(c);
    }


    public boolean saveSpacecraft(Product spacecraft) {
        try {
            db = helper.getWritableDatabase();

            ContentValues cv = new ContentValues();
            cv.put(Constants.NAME, spacecraft.getName());
            cv.put(Constants.PROPELLANT, spacecraft.getPrice());
            cv.put(Constants.DESTINATION, spacecraft.getDate());


            long result = db.insert(Constants.TB_NAME, Constants.ROW_ID, cv);
            if (result > 0) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            helper.close();
        }

        return false;
    }



    @SuppressLint("Range")
    public ArrayList<Product> retrieveSpacecrafts()
    {
        ArrayList<Product> spacecrafts1=new ArrayList<>();
        ArrayList<Product> spacecrafts=new ArrayList<>();

        String[] columns={Constants.ROW_ID,Constants.NAME,Constants.PROPELLANT,Constants.DESTINATION};

        //String sql = "SELECT DefaultId FROM tblsample where (DefaultId = 567) OR (Name = 567)";
        //Cursor cursor=database.rawQuery(sql,null);
        //if(cursor != null && cursor.getCount()>0){
        //    //value available
        //} else{
        //    //not avail
        //}
        try
        {
            db = helper.getWritableDatabase();
            Cursor c=db.query(Constants.TB_NAME,columns,null,null,null,null,null);

            int toTalprice=0;
            Cursor price=db.rawQuery(Constants.TOTAL_PRICE,null);
            if(price.moveToFirst())
                toTalprice= price.getInt(price.getColumnIndex("Total"));

            Product s,b,cc;

            if(c != null)
            {
                while (c.moveToNext())
                {
                    String s_name=c.getString(1);
                    String s_propellant=c.getString(2);
                    String s_destination=c.getString(3);


                    s=new Product();
                    s.setName(s_name);
                    s.setPrice(s_propellant);
                    s.setDate(s_destination);

                    spacecrafts.add(s);

                }
            }

            cc=new Product();
            cc.setName("");
            cc.setPrice("");
            cc.setDate("");
            spacecrafts.add(cc);

            b=new Product();
            b.setName("Total");
            b.setPrice(""+toTalprice);
            b.setDate("");
            spacecrafts.add(b);


        }catch (SQLException e)
        {
            e.printStackTrace();
        }


        return spacecrafts;
    }

}
