package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button btnSuma, btnResta, btnMultiplicacion, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());

                FuncionesMatematicas op = new FuncionesMatematicas(num1, num2);
                String resultado = "La suma es: " + op.suma();

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());

                FuncionesMatematicas op = new FuncionesMatematicas(num1, num2);
                String resultado = "La resta es: " + op.resta();

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());

                FuncionesMatematicas op = new FuncionesMatematicas(num1, num2);
                String resultado = "La multiplicación es: " + op.multiplicacion();

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());

                FuncionesMatematicas op = new FuncionesMatematicas(num1, num2);
                String resultado = null;
                try {
                    resultado = "La división es: " + op.division();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });
    }
}


