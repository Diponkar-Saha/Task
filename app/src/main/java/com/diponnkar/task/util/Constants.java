package com.diponnkar.task.util;

public class Constants {

    public static final String ROW_ID="id";
    public static final String NAME="name";
    public static final String PROPELLANT="propellant";
    public static final String DESTINATION="destination";



    public static final String DB_NAME="tv_DB";
    public static final String TB_NAME="tv_TB";
    public static final int DB_VERSION=1;

    /*
    TABLE CREATION STATEMENT
     */
    public static final String CREATE_TB="CREATE TABLE tv_TB(id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "name TEXT NOT NULL,propellant bigint NOT NULL,destination TEXT NOT NULL);";


    public static final String TOTAL_PRICE="SELECT SUM(propellant) as Total FROM tv_TB;";
//SELECT sale.quantity*item.price as TOTAL FROM item,sale WHERE item.product_id=sale.product_id;

    /*
    TABLE DELETION STMT
     */
    public static final String DROP_TB="DROP TABLE IF EXISTS "+TB_NAME;

}