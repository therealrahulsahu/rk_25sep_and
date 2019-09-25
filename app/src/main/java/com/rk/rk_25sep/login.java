package com.rk.rk_25sep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText id,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void run(View v)
    {
        id = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        String st_id = id.getText().toString();
        String st_pass = pass.getText().toString();
        if(st_id.equals("rahulsahu9719@gmail.com") && st_pass.equals("kiit"))
        {
            Toast.makeText(this,"Correct Password", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Wrong Password", Toast.LENGTH_SHORT).show();
        }
    }
}
