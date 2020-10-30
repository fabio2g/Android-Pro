package edu.br.unifcv.aula25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**public void alterarTexto(View view){
        TextView texto = findViewById(R.id.txt_resultado);
        texto.setText("Fabio");
    }**/
    public void sortearNumero(View view){
        TextView numero = findViewById(R.id.txt_resultado);

        int x = new Random().nextInt(1-100);

        numero.setText("Numero Sorteado: " + x);
    }

}