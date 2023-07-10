package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;

public class MainActivity extends AppCompatActivity {

    private TextView calculator_task;
    private Button button_DelAll;
    private Button button_Del;

    private Symbols mSymbols = new Symbols();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator_task = findViewById(R.id.calculator_task);

        button_DelAll = findViewById(R.id.button_DelAll);
        button_Del = findViewById(R.id.button_Del);

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
    public void onNumberClick(View view){
        Button button = (Button)view;
        calculator_task.append(button.getText());
    }
    public void onMathOperationClick(View view){
        Button button = (Button)view;
        calculator_task.append(button.getText());
    }

    public void onEnterTaskClick(View view){
        double answer;
        try {
            answer = mSymbols.eval(calculator_task.getText().toString());
            calculator_task.setText(String.valueOf(Math.round(answer)));
        } catch (SyntaxException e) {
            Toast.makeText(MainActivity.this, R.string.answer_wrong_task,Toast.LENGTH_LONG).show();
        }
    }
}