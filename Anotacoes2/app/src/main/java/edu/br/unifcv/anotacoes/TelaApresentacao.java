package edu.br.unifcv.anotacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaApresentacao extends AppCompatActivity {

    private Button botao1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_apresentacao);

        botao1 = (Button) findViewById(R.id.btn_anotacao);

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelaApresentacao.this, MainActivity.class));
            }
        });
        }


    }



