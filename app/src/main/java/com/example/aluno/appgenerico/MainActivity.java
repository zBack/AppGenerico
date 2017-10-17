package com.example.aluno.appgenerico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnCadastro;
    private Button btnLogin;
    private Button btnSobre;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            btnCadastro = (Button) findViewById(R.id.btnCadastro);
            btnLogin = (Button) findViewById(R.id.btnLogin);
            btnSobre = (Button) findViewById(R.id.btnSobre);


            btnCadastro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(
                            MainActivity.this,
                            CadastroActivity.class
                    ));

                }
            });
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(
                            MainActivity.this,
                            LoginActivity.class
                    ));

                }
            });
            btnSobre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(
                            MainActivity.this,
                            SobreActivity.class
                    ));

                }
            });

        }}