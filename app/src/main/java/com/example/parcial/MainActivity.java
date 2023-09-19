package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText num1, num2;
    TextView res;
    Button sumar, restar, dividir, multiplicar, calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.valor1);
        num2 = (EditText)findViewById(R.id.valor2);
        res = (TextView)findViewById(R.id.resultado);
        sumar = (Button)findViewById(R.id.sumar);
        restar = (Button)findViewById(R.id.restar);
        dividir = (Button)findViewById(R.id.dividir);
        multiplicar = (Button)findViewById(R.id.multiplicar);
        calcular = (Button)findViewById(R.id.Calculo);
        if(equals(sumar)){
            res = num1 + num2 = (EditText)findViewById(R.id.valor2);
        }else if(equals(restar)){
            res = num1 - num2 = (EditText)findViewById(R.id.valor2);
        }else if(equals(dividir)){
            res = num1 / num2 = (EditText)findViewById(R.id.valor2);
        }else if(equals(multiplicar)){
            res = num1 * num2 = (EditText)findViewById(R.id.valor2);
        }
        calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}