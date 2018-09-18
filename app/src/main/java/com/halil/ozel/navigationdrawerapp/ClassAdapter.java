package com.halil.ozel.navigationdrawerapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.MyViewHolder>{

    Context context;
    LayoutInflater layoutInflater;
    ArrayList<NavigationDrawerItem> mDataList;

    ClassAdapter(Context c,ArrayList<NavigationDrawerItem>data){


        this.context = c;
        this.layoutInflater = LayoutInflater.from(context);
        mDataList = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = layoutInflater.inflate(R.layout.tek_satir,viewGroup,false);
        MyViewHolder holder = new MyViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {


        NavigationDrawerItem tiklanilan = mDataList.get(i);
        myViewHolder.setData(tiklanilan,i);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView baslik;
        ImageView resim;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            baslik = itemView.findViewById(R.id.title);
            resim = itemView.findViewById(R.id.imgIcon);
        }

        public void setData(NavigationDrawerItem tiklanilan, int i) {

            this.baslik.setText(tiklanilan.getBaslik());
            this.resim.setImageResource(tiklanilan.getResimID());

        }
    }


}
