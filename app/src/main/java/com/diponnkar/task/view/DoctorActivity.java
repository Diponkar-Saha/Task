package com.diponnkar.task.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.diponnkar.model.Doctor;
import com.diponnkar.model.User;
import com.diponnkar.task.DoctorListAdapter;
import com.diponnkar.task.R;
import com.diponnkar.task.viewmodel.DoctorListViewModel;

import java.util.List;

public class DoctorActivity extends AppCompatActivity {

    private List<User> marvelModelList;
    private DoctorListAdapter adapter;
    private DoctorListViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new DoctorListAdapter(this, marvelModelList);
        recyclerView.setAdapter(adapter);

        Log.d("tttt","yyy");

        viewModel= new ViewModelProvider(this).get(DoctorListViewModel.class);
        viewModel.getDoctorListObserver().observe(this, new Observer<List<Doctor>>() {
            @Override
            public void onChanged(List<Doctor> marvelModels) {
                if(marvelModels!=null){
                    Log.d("tttt",marvelModels.toString());

                    for (Doctor i: marvelModels) {
                        marvelModelList=i.getUser();

                        adapter.setMarvelList(marvelModelList);
                    }





                }
            }
        });
        viewModel.makeApiCall();
    }
}