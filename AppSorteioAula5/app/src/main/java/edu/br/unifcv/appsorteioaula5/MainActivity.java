package edu.br.unifcv.appsorteioaula5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarTexto(View v) {
        TextView txt = findViewById(R.id.txt_Resultado);
        txt.setText("Texto alterado com sucesso");
    }

}