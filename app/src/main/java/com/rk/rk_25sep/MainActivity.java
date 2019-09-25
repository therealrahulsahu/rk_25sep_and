package com.rk.rk_25sep;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id)
        {
            case R.id.add:
                Toast.makeText(this,"Add is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.del:
                Toast.makeText(this,"Delete is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sea:
                Toast.makeText(this,"Search is selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.login:
                Intent in = new Intent(MainActivity.this, login.class);
                startActivity(in);
                break;
            case R.id.signup:
                Intent in2 = new Intent(MainActivity.this, signup.class);
                startActivity(in2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
