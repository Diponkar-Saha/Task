package com.diponnkar.task.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

;
import com.diponnkar.task.model.Doctor;
import com.diponnkar.task.model.DoctorResponse;
import com.diponnkar.task.data.remote.APIService;
import com.diponnkar.task.data.remote.RetroInstance;



import java.util.List;

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
        Call<DoctorResponse> call=apiService.getDoctorList();
        call.enqueue(new Callback<DoctorResponse>() {

            @Override
            public void onResponse(@NonNull Call<DoctorResponse> call, @NonNull Response<DoctorResponse> response) {

                if(response.body().getDoctors()!=null) {
                    doctorList.setValue(response.body().getDoctors());
                }else{
                    doctorList.setValue(null);
                }



            }

            @Override
            public void onFailure(Call<DoctorResponse> call, Throwable t) {
                doctorList.setValue(null);
            }
        });
    }
}