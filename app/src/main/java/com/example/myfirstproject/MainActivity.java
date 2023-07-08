package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView logo;
    private TextView calculator_task;
    private Button button_enter_task;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_0;
    private Button button_plus;
    private Button button_minus;
    private Button button_multiply;
    private Button button_div;
    private Button button_DelAll;
    private Button button_Del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);

        calculator_task = findViewById(R.id.calculator_task);
        button_enter_task = findViewById(R.id.button_enter_task);

        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_0 = findViewById(R.id.button_0);

        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        button_multiply = findViewById(R.id.button_multiply);
        button_div = findViewById(R.id.button_div);

        button_DelAll = findViewById(R.id.button_DelAll);
        button_Del = findViewById(R.id.button_Del);

        button_1.setOnClickListener(view -> {
                String calculatorTaskAdd1 = calculator_task.getText().toString()+1;
                calculator_task.setText(calculatorTaskAdd1);
            });

        button_2.setOnClickListener(view -> {
                String calculatorTaskAdd2 = calculator_task.getText().toString()+2;
                calculator_task.setText(calculatorTaskAdd2);
            });
        button_3.setOnClickListener(view -> {
                String calculatorTaskAdd3 = calculator_task.getText().toString()+3;
                calculator_task.setText(calculatorTaskAdd3);
            });
        button_4.setOnClickListener(view -> {
                String calculatorTaskAdd4 = calculator_task.getText().toString()+4;
                calculator_task.setText(calculatorTaskAdd4);
            });
        button_5.setOnClickListener(view -> {
                String calculatorTaskAdd5 = calculator_task.getText().toString()+5;
                calculator_task.setText(calculatorTaskAdd5);
            });
        button_6.setOnClickListener(view -> {
                String calculatorTaskAdd6 = calculator_task.getText().toString()+6;
                calculator_task.setText(calculatorTaskAdd6);
            });
        button_7.setOnClickListener(view -> {
                String calculatorTaskAdd7 = calculator_task.getText().toString()+7;
                calculator_task.setText(calculatorTaskAdd7);
            });
        button_8.setOnClickListener(view -> {
            String calculatorTaskAdd8 = calculator_task.getText().toString()+8;
            calculator_task.setText(calculatorTaskAdd8);
            });
        button_9.setOnClickListener(view -> {
                String calculatorTaskAdd9 = calculator_task.getText().toString()+9;
                calculator_task.setText(calculatorTaskAdd9);
            });
        button_0.setOnClickListener(view -> {
            String calculatorTaskAdd0 = calculator_task.getText().toString()+0;
            calculator_task.setText(calculatorTaskAdd0);
            });

        button_plus.setOnClickListener(view -> {
            String calculatorTaskAdd0 = calculator_task.getText().toString()+"+";
            calculator_task.setText(calculatorTaskAdd0);
        });
        button_minus.setOnClickListener(view -> {
            String calculatorTaskAdd0 = calculator_task.getText().toString()+"-";
            calculator_task.setText(calculatorTaskAdd0);
        });
        button_multiply.setOnClickListener(view -> {
            String calculatorTaskAdd0 = calculator_task.getText().toString()+"*";
            calculator_task.setText(calculatorTaskAdd0);
        });
        button_div.setOnClickListener(view -> {
            String calculatorTaskAdd0 = calculator_task.getText().toString()+":";
            calculator_task.setText(calculatorTaskAdd0);
        });

        button_DelAll.setOnClickListener(view -> {
            if (!calculator_task.getText().toString().equals("")){
                calculator_task.setText("");
            }
        });
        button_Del.setOnClickListener(view -> {
            if (!calculator_task.getText().toString().equals("")) {
                calculator_task.setText(calculator_task.getText().toString().substring(0, calculator_task.getText().toString().length() - 1));
            }
        });
    }
}