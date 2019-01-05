package com.example.rosomak.firstapp.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rosomak.firstapp.R;

public class CalculatorActivity extends AppCompatActivity {
    private TextView display;
    private View.OnClickListener numberButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.calcButton0:
                    display.setText(display.getText() + "0");
                    break;
                case R.id.calcButton1:
                    display.setText(display.getText() + "1");
                    break;
                case R.id.calcButton2:
                    display.setText(display.getText() + "2");
                    break;
                case R.id.calcButton3:
                    display.setText(display.getText() + "3");
                    break;
                case R.id.calcButton4:
                    display.setText(display.getText() + "4");
                    break;
                case R.id.calcButton5:
                    display.setText(display.getText() + "5");
                    break;
                case R.id.calcButton6:
                    display.setText(display.getText() + "6");
                    break;
                case R.id.calcButton7:
                    display.setText(display.getText() + "7");
                    break;
                case R.id.calcButton8:
                    display.setText(display.getText() + "8");
                    break;
                case R.id.calcButton9:
                    display.setText(display.getText() + "9");
                    break;
            }
        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);

        Button calcButton0 = findViewById(R.id.calcButton0);
        Button calcButton1 = findViewById(R.id.calcButton1);
        Button calcButton2 = findViewById(R.id.calcButton2);
        Button calcButton3 = findViewById(R.id.calcButton3);
        Button calcButton4 = findViewById(R.id.calcButton4);
        Button calcButton5 = findViewById(R.id.calcButton5);
        Button calcButton6 = findViewById(R.id.calcButton6);
        Button calcButton7 = findViewById(R.id.calcButton7);
        Button calcButton8 = findViewById(R.id.calcButton8);
        Button calcButton9 = findViewById(R.id.calcButton9);
        Button calcButtonComma = findViewById(R.id.calcButtonComma);
        Button calcButtonEquals = findViewById(R.id.calcButtonEquals);

        display = findViewById(R.id.calculatorDisplay);

        calcButton0.setOnClickListener(numberButtonClickListener);
        calcButton1.setOnClickListener(numberButtonClickListener);
        calcButton2.setOnClickListener(numberButtonClickListener);
        calcButton3.setOnClickListener(numberButtonClickListener);
        calcButton4.setOnClickListener(numberButtonClickListener);
        calcButton5.setOnClickListener(numberButtonClickListener);
        calcButton6.setOnClickListener(numberButtonClickListener);
        calcButton7.setOnClickListener(numberButtonClickListener);
        calcButton8.setOnClickListener(numberButtonClickListener);
        calcButton9.setOnClickListener(numberButtonClickListener);

    }
}
