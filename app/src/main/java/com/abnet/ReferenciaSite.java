package com.abnet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ReferenciaSite extends AppCompatActivity {

    Button btnVoltarSite;
    EditText etNomeSite;
    EditText etSobrenomeSite;
    EditText etNomeDaMateira;
    EditText etTituloSite;
    EditText etLinkSite;
    EditText etAcessoSite;
    EditText etResultadoSite;
    EditText etAnoSite;
    Button btnGerarRefSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencia_site);

        etNomeSite = findViewById(R.id.etNomeSite);
        etSobrenomeSite = findViewById(R.id.etSobrenomeSite);
        etNomeDaMateira = findViewById(R.id.etNomeDaMateira);
        etTituloSite = findViewById(R.id.etTituloSite);
        etLinkSite = findViewById(R.id.etLinkSite);
        etAcessoSite = findViewById(R.id.etAcessoSite);
        etResultadoSite = findViewById(R.id.etResultadoSite);
        btnGerarRefSite = findViewById(R.id.btnGerarRefSite);
        etAnoSite = findViewById(R.id.etAnoSite);

        btnGerarRefSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sobrenome = etSobrenomeSite.getText().toString().toUpperCase();
                String referencia = sobrenome + ", " + etNomeSite.getText().toString() +
                        ". " + etNomeDaMateira.getText().toString() + ". " + etTituloSite.getText().toString() +
                        ". " + etAnoSite.getText().toString() + ". " +
                        "Disponível em: <" + etLinkSite.getText().toString() + ">. " +
                         "Acesso em: " + etAcessoSite.getText().toString() + ".";

                etResultadoSite.setText(referencia);
            }
        });

        btnVoltarSite = findViewById(R.id.btnVoltarSite);
        btnVoltarSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}