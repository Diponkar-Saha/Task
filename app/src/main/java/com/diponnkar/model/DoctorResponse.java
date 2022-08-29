
package com.diponnkar.model;

import java.util.List;


public class DoctorResponse {



    private String msg="";

    private String status="";
    private List<Doctor> mDoctors;


    public List<Doctor> getDoctors() {
        return mDoctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        mDoctors = doctors;
    }



}
