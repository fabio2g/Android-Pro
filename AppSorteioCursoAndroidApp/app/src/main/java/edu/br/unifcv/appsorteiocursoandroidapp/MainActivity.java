package edu.br.unifcv.appsorteiocursoandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View view){

        int valor = new Random().nextInt(11);

        TextView texto  = findViewById(R.id.txt_resultado);
        texto.setText("O número sortado foi: " + valor);
    }
}