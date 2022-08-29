package com.diponnkar.task.service;

import com.diponnkar.model.DoctorResponse;


import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface APIService {

    @GET("our-doctors/")
    Call<Response<DoctorResponse>> getDoctorList();
}
