package com.diponnkar.task.model;


import com.google.gson.annotations.SerializedName;


public class Doctor {

    @SerializedName("bmdc")
    private Object mBmdc;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("department")
    private Department mDepartment;
    @SerializedName("doctor_department_id")
    private Long mDoctorDepartmentId;
    @SerializedName("experience")
    private Object mExperience;
    @SerializedName("fee")
    private String mFee;
    @SerializedName("id")
    private Long mId;
    @SerializedName("specialist")
    private String mSpecialist;
    @SerializedName("tenant_id")
    private String mTenantId;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("user")
    private User mUser;
    @SerializedName("user_id")
    private Long mUserId;

    public Object getBmdc() {
        return mBmdc;
    }

    public void setBmdc(Object bmdc) {
        mBmdc = bmdc;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public Department getDepartment() {
        return mDepartment;
    }

    public void setDepartment(Department department) {
        mDepartment = department;
    }

    public Long getDoctorDepartmentId() {
        return mDoctorDepartmentId;
    }

    public void setDoctorDepartmentId(Long doctorDepartmentId) {
        mDoctorDepartmentId = doctorDepartmentId;
    }

    public Object getExperience() {
        return mExperience;
    }

    public void setExperience(Object experience) {
        mExperience = experience;
    }

    public String getFee() {
        return mFee;
    }

    public void setFee(String fee) {
        mFee = fee;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getSpecialist() {
        return mSpecialist;
    }

    public void setSpecialist(String specialist) {
        mSpecialist = specialist;
    }

    public String getTenantId() {
        return mTenantId;
    }

    public void setTenantId(String tenantId) {
        mTenantId = tenantId;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public Long getUserId() {
        return mUserId;
    }

    public void setUserId(Long userId) {
        mUserId = userId;
    }

}
