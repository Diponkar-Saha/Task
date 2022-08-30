package com.diponnkar.task.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.diponnkar.task.R;
import com.diponnkar.task.model.Doctor;
import com.diponnkar.task.model.Medium;

import java.util.List;

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListAdapter.MyViewHolder> {

    private Context context;
    private List<Doctor> doctorList;
    private DoctorListAdapter.RecyclerViewClickClickListener listener;


    public DoctorListAdapter(Context context, List<Doctor> doctorList, DoctorListAdapter.RecyclerViewClickClickListener listener){
        this.context=context;
        this.doctorList=doctorList;
        this.listener = listener;
    }

    public void setMarvelList(List<Doctor> marvelList){
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

        for (Medium i:
                this.doctorList.get(position).getUser().getMedia()
             ) {
            Glide.with(context)
                    .load(i.getOriginalUrl())
                    .error(R.drawable.doctor)

                    .apply(RequestOptions.centerCropTransform())
                    .into(holder.imageView)
            ;

        }

        holder.doctorName.setText(this.doctorList.get(position).getUser().getFullName());
        holder.d2.setText(this.doctorList.get(position).getUser().getEmail());

    }

    @Override
    public int getItemCount() {
        if(this.doctorList!=null){
            return this.doctorList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView doctorName,d2;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            doctorName=(TextView) itemView.findViewById(R.id.titleView);
            d2=(TextView) itemView.findViewById(R.id.lastName);
            imageView=(ImageView) itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            listener.onClick(itemView,getAdapterPosition());
        }
    }
    public interface RecyclerViewClickClickListener{
        void onClick(View v,int position);

    }
}


