package com.diponnkar.task.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.diponnkar.task.R;
import com.diponnkar.task.databinding.ActivityDoctorDetailBinding;
import com.diponnkar.task.databinding.ActivityMainBinding;

public class DoctorDetailActivity extends AppCompatActivity {

    private ActivityDoctorDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDoctorDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        final Intent i=getIntent();

        String name=i.getStringExtra("name");
        String email=i.getStringExtra("email");
        String special=i.getStringExtra("special");
        String fee=i.getStringExtra("fee");
        String title=i.getStringExtra("title");
        String img=i.getStringExtra("img");

        binding.email.setText("Email : "+email);
        binding.name.setText("Name : "+name);
        binding.special.setText("Special : "+special);
        binding.fee.setText("Fee : "+fee);
        binding.title.setText("Title : "+title);
        Glide.with(getApplication())
                .load(img)
                .error(R.drawable.doctor)

                .apply(RequestOptions.centerCropTransform())
                .into(binding.img)
        ;




    }
}