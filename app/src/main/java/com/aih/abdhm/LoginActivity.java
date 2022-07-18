package com.aih.abdhm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        TextInputEditText phone=findViewById(R.id.phone);
        String txtPhone=phone.getText().toString();
        if (!txtPhone.equals("")&&txtPhone.length()==10){
            startActivity(new Intent(this,Dashboard.class));
            finish();
        }
    }
}