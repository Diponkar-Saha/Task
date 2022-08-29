
package com.diponnkar.model;


import java.util.List;


public class Doctor {


    public float id=0;
    public float user_id=0;
    public float doctor_department_id=0;
    public String specialist= "";
    public String fee= "";
    public String experience = "";
    public String bmdc = "";
    public String tenant_id= "";
    public String created_at= "";
    public String updated_at= "";
    public List<User> mUser;
    public List<User>  getUser() { return mUser;}




}
