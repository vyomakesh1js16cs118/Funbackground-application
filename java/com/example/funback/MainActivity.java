package com.example.funback;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private ConstraintLayout layout;
private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    layout=findViewById(R.id.cons);
    button=findViewById(R.id.imageButton);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Random random=new Random();
            int color= Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));

        layout.setBackgroundColor(color);
        }
    });
    }
}
