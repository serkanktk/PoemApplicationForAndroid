package com.example.poemapplication;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PoemAdapter extends RecyclerView.Adapter<PoemAdapter.PoemViewHolder> {

    Context ctx;
    List<Poem> data;

    public PoemAdapter(Context ctx, List<Poem> data){
        this.ctx = ctx;
        this.data = data;
    }

    @NonNull
    @Override
    public PoemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(ctx).inflate(R.layout.poem_row_layout, parent, false);
        PoemViewHolder viewHolder = new PoemViewHolder(row);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PoemViewHolder holder, int position) {
        Poem current = data.get(position);

        holder.img.setImageResource(current.getImg());
        holder.txtPoetName.setText(current.getPoet());
        holder.txtPoemName.setText(current.getPoemName());

        holder.row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(ctx, current.getPoemName(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ctx, PoemContext.class);
                i.putExtra("selectedpoem", current);
                ((AppCompatActivity)ctx).startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    static class PoemViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txtPoetName;
        TextView txtPoemName;
        CardView row;

        public PoemViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgPoet);
            txtPoemName = itemView.findViewById(R.id.txtPoemName);
            txtPoetName = itemView.findViewById(R.id.txtPoetName);
            row = itemView.findViewById(R.id.row);

        }
    }



}
