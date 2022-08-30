package com.diponnkar.task.data.local;

import android.content.Context;

import com.diponnkar.task.adapter.DBAdapter;
import com.diponnkar.task.model.Product;

import java.util.ArrayList;

public class TableHelper {


    Context c;
    private String[] spaceProbeHeaders={"Product Name","Price","Date"};
    private String[][] spaceProbes;


    public TableHelper(Context c) {
        this.c = c;
    }


    public String[] getSpaceProbeHeaders()
    {
        return spaceProbeHeaders;
    }


    public  String[][] getSpaceProbes()
    {
        ArrayList<Product> spacecrafts=new DBAdapter(c).retrieveSpacecrafts();
        Product s;

        spaceProbes= new String[spacecrafts.size()][3];

        for (int i=0;i<spacecrafts.size();i++) {

            s=spacecrafts.get(i);

            spaceProbes[i][0]=s.getName();
            spaceProbes[i][1]=s.getPrice();
            spaceProbes[i][2]=s.getDate();
        }

        return spaceProbes;





    }
}
