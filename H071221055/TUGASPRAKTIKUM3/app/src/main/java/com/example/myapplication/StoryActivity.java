package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        ImageView ivProfile = findViewById(R.id.iv_profile2);
        TextView tvProfile = findViewById(R.id.tv_profile2);
        ImageView imageStory = findViewById(R.id.imageStory);

        Intent intent = getIntent();
        tes profile = intent.getParcelableExtra("User");

        ivProfile.setImageResource(profile.getProfileImage());
        tvProfile.setText(profile.getUsername());
        imageStory.setImageResource(profile.getStoryImage());

        tvProfile.setOnClickListener(v->{
            Intent i = new Intent(this, ProfileActivity.class);
            i.putExtra("User",profile);
            startActivity(i);
        });
//
    }
}