package com.diponnkar.task.viewmodel;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.diponnkar.model.Doctor;
import com.diponnkar.model.DoctorResponse;
import com.diponnkar.task.service.APIService;
import com.diponnkar.task.service.RetroInstance;



import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DoctorListViewModel extends ViewModel {
    private MutableLiveData<List<Doctor>> doctorList;


    public DoctorListViewModel(){
        doctorList=new MutableLiveData<>();
    }

    public MutableLiveData<List<Doctor>> getDoctorListObserver(){
        return doctorList;
    }
    public void makeApiCall(){
        APIService apiService= RetroInstance.getRetroClient().create(APIService.class);
        Call<Response<DoctorResponse>> call=apiService.getDoctorList();
        call.enqueue(new Callback<Response<DoctorResponse>>() {

            @Override
            public void onResponse(@NonNull Call<Response<DoctorResponse>> call, @NonNull Response<Response<DoctorResponse>> response) {

                if(response.body().body().getDoctors()!=null) {
                    doctorList.postValue(response.body().body().getDoctors());
                }



            }

            @Override
            public void onFailure(Call<Response<DoctorResponse>> call, Throwable t) {
                doctorList.postValue(null);
            }
        });
    }
}