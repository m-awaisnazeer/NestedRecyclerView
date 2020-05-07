package com.example.nestedrecyclerview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecyclerview.Models.HorizontalModel;
import com.example.nestedrecyclerview.R;

import java.util.ArrayList;

public class HorizontalRVAdapter extends RecyclerView.Adapter<HorizontalRVAdapter.HorizontalViewHolder> {

    ArrayList<HorizontalModel> modelArrayList;
    Context mContext;

    public HorizontalRVAdapter(ArrayList<HorizontalModel> modelArrayList, Context mContext) {
        this.modelArrayList = modelArrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalitem,parent,false);
        return new HorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {
        final HorizontalModel horizontalModel = modelArrayList.get(position);
        holder.name.setText(horizontalModel.getName());
        holder.description.setText(horizontalModel.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, horizontalModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public static class HorizontalViewHolder extends RecyclerView.ViewHolder{

        View itemView;
        TextView name,description;
        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;

            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
        }
    }
}
