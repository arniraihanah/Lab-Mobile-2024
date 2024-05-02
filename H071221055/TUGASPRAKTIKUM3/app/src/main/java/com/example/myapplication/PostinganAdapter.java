package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostinganAdapter extends RecyclerView.Adapter<PostinganAdapter.ViewHolder> {

    private final ArrayList<tes> newdata;

    private Context context;

    public PostinganAdapter(ArrayList<tes> newdata, Context context) {
        this.context =context;
        this.newdata = newdata;
    }

    @NonNull
    @Override
    public PostinganAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostinganAdapter.ViewHolder holder, int position) {
        tes newdatas = newdata.get(position);
        holder.setData(newdatas);

        holder.tvUser.setOnClickListener(v->{
            Intent intent = new Intent(context, ProfileActivity.class);
            intent.putExtra("User",newdatas);
            context.startActivity(intent);
        });

    holder.imageView2.setOnClickListener(v->{
        Intent intent = new Intent(context, StoryActivity.class);
        intent.putExtra("User",newdatas);
        context.startActivity(intent);
    });

    }
    @Override
    public int getItemCount() {
        return newdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageView, imageView2;

        private final TextView tvUser, tvDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView2 = itemView.findViewById(R.id.iv_profile);
            imageView = itemView.findViewById(R.id.iv_post);
            tvUser = itemView.findViewById(R.id.tv_user);
            tvDesc = itemView.findViewById(R.id.tv_desc);
        }

        public void setData(tes newdatas) {
            imageView2.setImageResource(newdatas.getProfileImage());
            imageView.setImageResource(newdatas.getPostImage());
            tvUser.setText(newdatas.getUsername());
            tvDesc.setText(newdatas.getDesc());
        }
    }
}
