package com.example.myapplicationusingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Message_Toast(View view){

        Toast.makeText(this,"Hola que tal... Espero que pases un buen dia ",Toast.LENGTH_LONG).show();
    }
}