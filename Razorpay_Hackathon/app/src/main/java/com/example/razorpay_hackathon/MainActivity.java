package com.example.razorpay_hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         SharedPreferences paymentdata = getApplicationContext().getSharedPreferences("PD", 0);
        String phoneNum  = paymentdata.getString("phone_number", null);
        String amt  = paymentdata.getString("amount", null);
        int amon = Integer.parseInt(amt);
        amon = amon*100;
        String amount = ""+amon;

        
