package com.diponnkar.task.model;


import java.util.List;

import com.google.gson.annotations.SerializedName;


public class DoctorResponse {

    @SerializedName("doctors")
    private List<Doctor> mDoctors;
    @SerializedName("msg")
    private String mMsg;
    @SerializedName("status")
    private String mStatus;

    public List<Doctor> getDoctors() {
        return mDoctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        mDoctors = doctors;
    }

    public String getMsg() {
        return mMsg;
    }

    public void setMsg(String msg) {
        mMsg = msg;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}

