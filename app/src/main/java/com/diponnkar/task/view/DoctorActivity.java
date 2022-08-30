package com.diponnkar.task.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.diponnkar.task.adapter.DoctorListAdapter;
import com.diponnkar.task.R;
import com.diponnkar.task.model.Doctor;
import com.diponnkar.task.model.Medium;
import com.diponnkar.task.viewmodel.DoctorListViewModel;

import java.util.List;

public class DoctorActivity extends AppCompatActivity  {

    private List<Doctor> mModelList;
    private DoctorListAdapter adapter;
    private DoctorListViewModel viewModel;
    String image;
    private DoctorListAdapter.RecyclerViewClickClickListener listener;

    public DoctorActivity(){

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        setOnClickListener();
        LinearLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new DoctorListAdapter(getApplication(), mModelList,listener);
        recyclerView.setAdapter(adapter);



        viewModel= new ViewModelProvider(this).get(DoctorListViewModel.class);
        viewModel.getDoctorListObserver().observe(this, new Observer<List<Doctor>>() {
            @Override
            public void onChanged(List<Doctor> mModels) {
                if(mModels!=null){
                    mModelList=mModels;
                    adapter.setMarvelList(mModels);

                }
            }
        });
        viewModel.makeApiCall();
    }

    private void setOnClickListener() {
        listener = new DoctorListAdapter.RecyclerViewClickClickListener() {

            @Override
            public void onClick(View v, int position) {
                Toast.makeText(DoctorActivity.this, "Click", Toast.LENGTH_SHORT).show();


                Intent intent=new Intent(getApplicationContext(), DoctorDetailActivity.class);


                String name=mModelList.get(position).getUser().getFullName();
                String email=mModelList.get(position).getUser().getEmail();
                String special=mModelList.get(position).getSpecialist();
                String fee=mModelList.get(position).getFee();
                String title=mModelList.get(position).getDepartment().getTitle();

                for (Medium i:
                        mModelList.get(position).getUser().getMedia()) {
                    image = i.getOriginalUrl();
                }
                String img=image;

                intent.putExtra("name",name);
                intent.putExtra("email",email);
                intent.putExtra("special",special);
                intent.putExtra("fee",fee);
                intent.putExtra("title",title);
                intent.putExtra("img",img);
                startActivity(intent);



            }
        };
    }


}