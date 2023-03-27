package com.example.yangliu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;

import me.minetsh.imaging.core.IMGMode;
import me.minetsh.imaging.view.IMGView;

public class MainActivity extends AppCompatActivity {
    IMGView imageView;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dog);
        imageView = findViewById(R.id.image_canvas);
        imageView.setImageBitmap(bitmap);
        findViewById(R.id.doodle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setMode(IMGMode.DOODLE);
            }
        });
        findViewById(R.id.mosaic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setMode(IMGMode.MOSAIC);
            }
        });
    }
}