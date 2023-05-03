package com.aulas.dolaremreal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
        Date data = new Date();
        String dataFormatada = formataData.format(data);

        TextView textData;

        textData = findViewById(R.id.textData);

        textData.setText(dataFormatada);
    }

    public void converter(View view){
        EditText editDolar;
        TextView textView;

        editDolar = findViewById(R.id.editDolar);
        textView = findViewById(R.id.textView);

        double valorDolar = Double.parseDouble(editDolar.getText().toString());
        double valorConvertido = valorDolar * 5.01;
        //textView.setText("R$ "+valorConvertido %,.2f);
        textView.setText(String.format("R$ %.2f",valorConvertido));

    }


}