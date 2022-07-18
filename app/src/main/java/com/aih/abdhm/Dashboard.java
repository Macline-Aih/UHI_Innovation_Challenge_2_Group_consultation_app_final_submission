package com.aih.abdhm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void upcoming(View view) {
        startActivity(new Intent(this,UpComing.class));
    }

    public void bookApp(View view) {
        startActivity(new Intent(this,BookCons.class));
    }
}