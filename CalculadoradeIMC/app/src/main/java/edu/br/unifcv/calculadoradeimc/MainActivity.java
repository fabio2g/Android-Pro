package edu.br.unifcv.calculadoradeimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editPeso;
    private EditText editAltura;
    private TextView editResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.campo_peso);
        editAltura = findViewById(R.id.campo_altura);
        editResultado = findViewById(R.id.txt_resultado);
    }

    public void calcularIMC(View v){
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        double imc = peso / (altura * altura);
        editResultado.setText("Imc" + imc);


        if (imc >= 18.5 && imc <= 24.99){
            editResultado.setText("Seu IMC é de "+ String.format("%.2f", imc) + ". Você está em seu peso ideal.");

        } else if(imc >= 25 && imc <= 29.99){
            editResultado.setText("Seu IMC é de "+ String.format("%.2f", imc) + ". Você está acima do peso.");

        } else if(imc >=30 && imc <= 34.99){
            editResultado.setText("Seu IMC é de "+ String.format("%.2f", imc) + ". Você está em obesidade grau I.");

        } else if (imc >=35 && imc <= 39.99){
            editResultado.setText("Seu IMC é de "+ String.format("%.2f", imc) + ". Você está em obesidade grau II.");

        } else if (imc >= 40){
            editResultado.setText("Seu IMC é de "+ String.format("%.2f", imc) + ". Você está em obesidade grau III");
        }
        else{
            editResultado.setText("VALOR INVALIDO");
        }
    }
}