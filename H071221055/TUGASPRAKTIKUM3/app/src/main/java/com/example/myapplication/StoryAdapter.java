package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder>{

    private final ArrayList<tes> newdata;

    private Context context;

    public StoryAdapter(ArrayList<tes> newdata, Context context) {
        this.context = context;
        this.newdata = newdata;
    }

    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_story,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        tes newdatas = newdata.get(position);
        holder.setData(newdatas);

        holder.imageView.setOnClickListener(v->{
            Intent intent = new Intent(context, StoryActivity.class);
            intent.putExtra("User",newdatas);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return newdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView;
        private final TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_nama);
            imageView = itemView.findViewById(R.id.iv_story);
        }

        public void setData(tes story) {
            textView.setText(story.getUsername());
            imageView.setImageResource(story.getStoryImage());
        };

    }
}
