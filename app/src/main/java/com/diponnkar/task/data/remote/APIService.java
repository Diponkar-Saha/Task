package com.diponnkar.task.data.remote;


import com.diponnkar.task.model.DoctorResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("our-doctors/")
    Call<DoctorResponse> getDoctorList();
}
