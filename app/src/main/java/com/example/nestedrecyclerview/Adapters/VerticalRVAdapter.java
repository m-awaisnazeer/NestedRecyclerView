package com.example.nestedrecyclerview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecyclerview.Models.HorizontalModel;
import com.example.nestedrecyclerview.Models.VerticalModel;
import com.example.nestedrecyclerview.R;

import java.util.ArrayList;

public class VerticalRVAdapter extends RecyclerView.Adapter<VerticalRVAdapter.VerticalViewHolder> {


    ArrayList<VerticalModel> mArrayList;
    Context mContext;

    public VerticalRVAdapter(ArrayList<VerticalModel> mArrayList, Context mContext) {
        this.mArrayList = mArrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public VerticalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.verticalitem,parent,false);

        return new VerticalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalViewHolder holder, int position) {
        VerticalModel verticalModel = mArrayList.get(position);
        ArrayList<HorizontalModel> modelArrayList = verticalModel.getModelArrayList();
        final String Category = verticalModel.getCategory();
        holder.CategoryTV.setText(Category);
        holder.VrecyclerView.setLayoutManager(new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false));
        holder.VrecyclerView.setHasFixedSize(true);

        HorizontalRVAdapter horizontalRVAdapter = new HorizontalRVAdapter(modelArrayList, mContext);
        holder.VrecyclerView.setAdapter(horizontalRVAdapter);
        //holder.VrecyclerView.notify();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, Category, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public static class VerticalViewHolder extends RecyclerView.ViewHolder{

        RecyclerView VrecyclerView;
        TextView CategoryTV;
        View itemView;

        public VerticalViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            VrecyclerView = itemView.findViewById(R.id.horizontalRV);
            CategoryTV = itemView.findViewById(R.id.VIcategory);

        }
    }
}
