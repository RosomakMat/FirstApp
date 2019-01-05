package com.example.rosomak.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rosomak.firstapp.calculator.CalculatorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SomeClass referencjaDoSomeClass;
        referencjaDoSomeClass = new SomeClass();

        TextView dupa = findViewById(R.id.dupa_w_layoutcie);
        dupa.setText(referencjaDoSomeClass.hello());


        Button guzik = findViewById(R.id.button);
        referencjaDoSomeClass.funkcjaNadajacaTekstNaGuzik(guzik);

        ImageView obrazek = findViewById(R.id.imageView);
        obrazek.setImageResource(R.drawable.ic_launcher_background);


        Button goToCalculator;
        goToCalculator = findViewById(R.id.goToCalculatorButton);

        goToCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obslugaKliknieciaGuzika();
            }
        });
    }


    public void obslugaKliknieciaGuzika() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, CalculatorActivity.class);
        startActivity(intent);
    }

}