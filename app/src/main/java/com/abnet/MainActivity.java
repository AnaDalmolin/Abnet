package com.abnet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRefSite;
    Button btnRefLivro;
    Button btnRefArtigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRefSite = findViewById(R.id.btnRefSite);
        btnRefSite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ReferenciaSite.class);
                startActivity(intent);

            }
        });

        btnRefLivro = findViewById(R.id.btnRefLivro);
        btnRefLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ReferenciaAutor.class);
                startActivity(intent);
            }
        });

        btnRefArtigo = findViewById(R.id.btnRefrArtigo);
        btnRefArtigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RefeferenciaArtigo.class);
                startActivity(intent);
            }
        });

    }
}