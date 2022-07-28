package com.abnet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReferenciaAutor extends AppCompatActivity {

    EditText etNomeLivro;
    EditText etSobrenomeLivro;
    EditText etTituloLivro;
    EditText etEdicaoLivro;
    EditText etLocalDePulicacaoLivro;
    EditText etEditoraLivro;
    EditText etAnoLivro;
    EditText etResultadoLivro;
    Button btnGerarRefLivro;
    Button btnVoltarLivro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencia_autor);

        etNomeLivro = findViewById(R.id.etNomeLivro);
        etSobrenomeLivro = findViewById(R.id.etSobrenomeLivro);
        etTituloLivro = findViewById(R.id.etTituloLivro);
        etEdicaoLivro = findViewById(R.id.etEdicaoLivro);
        etLocalDePulicacaoLivro = findViewById(R.id.etLocalDePulicacaoLivro);
        etEdicaoLivro = findViewById(R.id.etEdicaoLivro);
        etEditoraLivro = findViewById(R.id.etEditoraLivro);
        etAnoLivro = findViewById(R.id.etAnoLivro);
        etResultadoLivro = findViewById(R.id.etResultadoLivro);
        btnGerarRefLivro = findViewById(R.id.btnGerarRefLivro);

        btnGerarRefLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sobrenome = etSobrenomeLivro.getText().toString().toUpperCase();
                String referencia = sobrenome + ", " + etNomeLivro.getText().toString() + ". " +
                        etTituloLivro.getText().toString() + ". " + etEdicaoLivro.getText().toString() +
                        ". ed. " + etLocalDePulicacaoLivro.getText().toString() + ": " +
                        etEditoraLivro.getText().toString() + ", " + etAnoLivro.getText().toString() + ".";

                etResultadoLivro.setText(referencia);

            }
        });

        btnVoltarLivro = findViewById(R.id.btnVoltarLivro);
        btnVoltarLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}