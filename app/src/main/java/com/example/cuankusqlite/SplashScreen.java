package com.example.cuankusqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    TextView txtCuanku;
    private int waktu_loading = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },waktu_loading);

        txtCuanku = findViewById(R.id.txtcuanku);
        Typeface customfont = Typeface.createFromAsset(getAssets(), "font/AngillaScript.ttf");
        txtCuanku.setTypeface(customfont);
    }
}
