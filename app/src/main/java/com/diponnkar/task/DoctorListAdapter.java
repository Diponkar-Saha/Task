package com.diponnkar.task;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.diponnkar.model.User;


import java.util.List;

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListAdapter.MyViewHolder> {

    private Context context;
    private List<User> doctorList;

    public DoctorListAdapter(Context context, List<User> doctorList){
        this.context=context;
        this.doctorList=doctorList;
    }

    public void setMarvelList(List<User> marvelList){
        this.doctorList=marvelList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public DoctorListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorListAdapter.MyViewHolder holder, int position) {

        holder.doctorName.setText(this.doctorList.get(position).getFirst_name());

    }

    @Override
    public int getItemCount() {
        if(this.doctorList!=null){
            return this.doctorList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView doctorName;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            doctorName=(TextView) itemView.findViewById(R.id.titleView);
            imageView=(ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}

