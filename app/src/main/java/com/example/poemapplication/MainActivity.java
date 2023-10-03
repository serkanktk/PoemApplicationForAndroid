package com.example.poemapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    List<Poem> data = Poem.getAllPoems();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recView = findViewById(R.id.recPoems);
        recView.setLayoutManager(new LinearLayoutManager(this));
        PoemAdapter adp = new PoemAdapter(this, data);
        recView.setAdapter(adp);



    }
}