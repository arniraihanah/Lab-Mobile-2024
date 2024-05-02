package com.example.myapplication;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PostinganActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postingan_actvity);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvUsername = findViewById(R.id.tv_user);
        ImageView ivPost = findViewById(R.id.iv_post);
        TextView tvDesc = findViewById(R.id.tv_desc);

        Intent intent = getIntent();

        tes newdata = intent.getParcelableExtra("User");



        ivProfile.setImageResource(newdata.getProfileImage());
        tvUsername.setText(newdata.getUsername());
        ivPost.setImageResource(newdata.getPostImage());
        tvDesc.setText(newdata.getDesc());

        ivProfile.setOnClickListener(v->{
            Intent i = new Intent(this, StoryActivity.class);
            i.putExtra("User",newdata);
            startActivity(i);
        });

        tvUsername.setOnClickListener(v->{
            Intent i = new Intent(this, ProfileActivity.class);
            i.putExtra("User",newdata);
            startActivity(i);
        });
    }

}
