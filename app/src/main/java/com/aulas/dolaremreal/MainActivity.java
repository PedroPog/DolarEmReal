package com.aulas.dolaremreal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private double dolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize exchange rate to 0
        dolar = 5.01;

        // Set current date in textData TextView
        TextView textData = findViewById(R.id.textData);
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = formataData.format(new Date());
        textData.setText(dataFormatada);

        // Set initial exchange rate in textView2 TextView
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(String.format("R$ %.2f", dolar));
    }

    public void converter(View view) {
        //EditText editDolar;
        //TextView textView;
        //editDolar = findViewById(R.id.ediDolar);
        //textView = findViewById(R.id.textView);

        EditText editDolar = findViewById(R.id.editDolar);
        TextView textView = findViewById(R.id.textView);

        double valorDolar = Double.parseDouble(editDolar.getText().toString());
        double valorConvertido = valorDolar * dolar;

        textView.setText(String.format("R$ %.2f", valorConvertido));
    }

    public void mudarValor(View view) {
        EditText editValor = findViewById(R.id.editValor);
        TextView textView2 = findViewById(R.id.textView2);

        dolar = Double.parseDouble(editValor.getText().toString());
        textView2.setText("R$ " + dolar);
        editValor.setText("");
    }
}
