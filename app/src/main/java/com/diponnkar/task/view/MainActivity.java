package com.diponnkar.task.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.diponnkar.task.databinding.ActivityMainBinding;
import com.diponnkar.task.view.DoctorActivity;
import com.diponnkar.task.view.TaskTwoActivity;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.appCompatButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(getApplication(), TaskTwoActivity.class);
                startActivity(k);

            }
        });

        binding.appCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent k = new Intent(getApplication(), DoctorActivity.class);
                startActivity(k);
            }
        });


    }
}