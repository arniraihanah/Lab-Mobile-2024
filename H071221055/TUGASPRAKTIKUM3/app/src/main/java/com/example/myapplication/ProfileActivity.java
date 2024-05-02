package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView ivProfile = findViewById(R.id.iv_profile);
        TextView tvProfile = findViewById(R.id.Tv_profile);
        TextView tvAngkaFollowers = findViewById(R.id.Tv_followers);
        TextView tvAngkaFollowing = findViewById(R.id.Tv_following);
        ImageView ivPost = findViewById(R.id.iv_post);

        Intent intent = getIntent();

        tes newdata = intent.getParcelableExtra("User");


        ivProfile.setImageResource(newdata.getProfileImage());
        tvProfile.setText(newdata.getUsername());
        tvAngkaFollowers.setText(newdata.getFollowers());
        tvAngkaFollowing.setText(newdata.getFollowing());
        ivPost.setImageResource(newdata.getPostImage());

        ivProfile.setOnClickListener(v->{
            Intent i = new Intent(this, StoryActivity.class);
            i.putExtra("User",newdata);
            startActivity(i);
        });

        ivPost.setOnClickListener(v->{
            Intent i = new Intent(this, PostinganActivity.class);
            i.putExtra("User",newdata);
            startActivity(i);
        });
    }
}
