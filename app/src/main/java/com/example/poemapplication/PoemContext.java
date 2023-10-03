package com.example.poemapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PoemContext extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_context);

        Poem selected = (Poem)getIntent().getSerializableExtra("selectedpoem");

        ImageView img = findViewById(R.id.imageView);
        img.setImageResource(selected.getImg());

        TextView txt = findViewById(R.id.textView2);
        txt.setText(selected.getPoem());

        getSupportActionBar().setTitle(selected.getPoemName());


    }
}