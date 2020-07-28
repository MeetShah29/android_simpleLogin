package com.example.simple_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClicked(View view){

        EditText editText=findViewById(R.id.userName);
        EditText password=findViewById(R.id.password);
        Toast.makeText(this,"Hi there, "+ editText.getText().toString()+"\n"+password.getText().toString(), Toast.LENGTH_SHORT).show();
        Log.i("Info",editText.getText().toString());
        Log.i("Info",password.getText().toString());
    }
}