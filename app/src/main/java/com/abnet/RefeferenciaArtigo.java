package com.abnet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RefeferenciaArtigo extends AppCompatActivity {

    Button btnVoltarArtigo;
    EditText etNomeArtigo;
    EditText etSobrenomeArtigo;
    EditText etTituloArtigo;
    EditText etTituloRevista;
    EditText etLocalPublicacaoArtigo;
    EditText etVolumeDoExemplar;
    EditText etNumeroDoExemplarArtigo;
    EditText etPaginaInicialArtigo;
    EditText etPaginaFinalArtigo;
    Button btnGerarRefArtigo;
    EditText etResultadoArtigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refeferencia_artigo);

        etNomeArtigo = findViewById(R.id.etNomeArtigo);
        etSobrenomeArtigo = findViewById(R.id.etSobrenomeArtigo);
        etTituloArtigo = findViewById(R.id.etTituloArtigo);
        etTituloRevista = findViewById(R.id.etTituloRevista);
        etLocalPublicacaoArtigo = findViewById(R.id.etLocalPublicacaoArtigo);
        etVolumeDoExemplar = findViewById(R.id.etVolumeExemplar);
        etNumeroDoExemplarArtigo = findViewById(R.id.etNumeroDoExemplarArtigo);
        etPaginaInicialArtigo = findViewById(R.id.etPaginaInicialArtigo);
        etPaginaFinalArtigo = findViewById(R.id.etPaginaFinalArtigo);
        btnGerarRefArtigo = findViewById(R.id.btnGerarRefArtigo);
        etResultadoArtigo = findViewById(R.id.etResultadoArtigo);



        btnGerarRefArtigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sobrenome = String.valueOf(etSobrenomeArtigo.getText()).toString().toUpperCase();
                String Referencia = sobrenome + ", " + etNomeArtigo.getText().toString() + ". " + etTituloArtigo.getText().toString() + ". "+ etTituloRevista.getText().toString() + ", " + etLocalPublicacaoArtigo.getText().toString() + ", " +
                        etVolumeDoExemplar.getText().toString() + ", " + etNumeroDoExemplarArtigo.getText().toString()+", "+ "p. "+  etPaginaInicialArtigo.getText().toString() +  "-" + etPaginaFinalArtigo.getText().toString() + ".";

                etResultadoArtigo.setText(Referencia);
            }
        });


        btnVoltarArtigo = findViewById(R.id.btnVoltarArtigo);
        btnVoltarArtigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}