package com.aih.abdhm.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.aih.abdhm.DataModel.DoctorListResponse.Fulfillments;
import com.aih.abdhm.R;

import java.util.ArrayList;

public class DoctorListAdapter extends RecyclerView.Adapter<DoctorListAdapter.ViewHolder>{
    private ArrayList<Fulfillments> listdata;

    // RecyclerView recyclerView;
    public DoctorListAdapter(ArrayList<Fulfillments> listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.doctor_list_name, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fulfillments fulfillments=  listdata.get(position);
        holder.doctor_name.setText(fulfillments.getAgent().getName());
;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+fulfillments,Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView doctor_name;

        public ViewHolder(View itemView) {
            super(itemView);

            this.doctor_name = (TextView) itemView.findViewById(R.id.name);

        }
    }
}
