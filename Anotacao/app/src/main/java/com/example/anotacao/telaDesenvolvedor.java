package com.example.anotacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class telaDesenvolvedor extends AppCompatActivity {

    private Button botao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_desenvolvedor);


        botao2 = (Button)findViewById(R.id.btn_botao2);

        botao2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(telaDesenvolvedor.this, MainActivity.class));
            }
        });

    }
}