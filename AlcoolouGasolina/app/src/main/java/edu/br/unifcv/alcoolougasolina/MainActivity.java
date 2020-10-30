package edu.br.unifcv.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAlcool;
    private EditText editGasolina;
    private TextView editResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = findViewById(R.id.valor_alcool);
        editGasolina = findViewById(R.id.valor_gasolina);
        editResultado = findViewById(R.id.txt_resultado);

    }
    public void calculo(View view){
        double precoAlcool = Double.parseDouble(editAlcool.getText().toString());
        double precoGasolina = Double.parseDouble(editGasolina.getText().toString());
        double resultado = precoAlcool / precoGasolina;

        if (resultado >= 0.7){
            editResultado.setText("Melhor opção: GASOLINA");
        }
        else {
            editResultado.setText("Melhor opção: ALCOOL");
        }


    }

}
