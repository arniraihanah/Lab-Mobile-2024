package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvPostingan = findViewById(R.id.rv_post);
        rvPostingan.setHasFixedSize(true);

        PostinganAdapter postinganAdapter = new PostinganAdapter(DataSource.newdata,this);
        rvPostingan.setAdapter(postinganAdapter);

        RecyclerView rvStory = findViewById(R.id.rv_story);
        rvStory.setHasFixedSize(true);

        StoryAdapter storyAdapter = new StoryAdapter(DataSource.newdata, this);
        rvStory.setAdapter(storyAdapter);
    }

}