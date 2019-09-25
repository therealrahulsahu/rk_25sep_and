package com.rk.rk_25sep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText id,pass,re_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void run(View v)
    {
        id = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        re_pass = findViewById(R.id.re_password);
        String st_id = id.getText().toString();
        String st_pass = pass.getText().toString();
        String st_re_pass = re_pass.getText().toString();
        if(st_pass.equals(st_re_pass))
        {
            Toast.makeText(this,"Account Created", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Password Not Matched", Toast.LENGTH_SHORT).show();
        }
    }
}
