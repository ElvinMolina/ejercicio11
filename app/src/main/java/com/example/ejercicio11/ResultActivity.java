package com.example.ejercicio11;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewResultado = findViewById(R.id.textViewResultado);

        String resultado = getIntent().getStringExtra("resultado");
        textViewResultado.setText(resultado);
    }
}
