package edu.br.unifcv.aula15_09;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkSim;
    private TextView textoresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoresultado = findViewById(R.id.txt_resultado);
        checkSim = findViewById(R.id.checkSim);
    }

    public void enviar (View view){
        /*
        EditText campoNome = findViewById(R.id.txt_nome);


        String nome = campoNome.getText().toString();
        textoresultado.setText(nome);*/

    }
    public void checkbok(){
        boolean resultadoSim = checkSim.isChecked();
        textoresultado.setText("Sim " + resultadoSim);


    }

}