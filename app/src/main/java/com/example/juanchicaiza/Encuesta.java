package com.example.juanchicaiza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {

    EditText respuestaL;
    Button bEcuesta,radioS, radioN, cFutbol, cTenis, cBaloncesto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        respuestaL=findViewById(R.id.etRespuesta);
        cFutbol=findViewById(R.id.ckbFutbol);
        cTenis=findViewById(R.id.ckbTenis);
        cBaloncesto=findViewById(R.id.ckbBaloncesto);
        radioS=findViewById(R.id.rbSi);
        radioN=findViewById(R.id.rbNo);
        bEcuesta=findViewById(R.id.btnEnviarEncuesta);

    }

    public void EnviarEncuesta(View view){
        String respues,fut,ten,bal,si,no;
        respues = respuestaL.getText().toString();
        fut = cFutbol.getText().toString();
        ten = cTenis.getText().toString();
        bal = cBaloncesto.getText().toString();
        si = radioS.getText().toString();
        no = radioN.getText().toString();
        Intent intent = new Intent(Encuesta.this, Resumen.class);
        intent.putExtra("",respues);
        intent.putExtra("Futbol",fut);
        intent.putExtra("Tenis",ten);
        intent.putExtra("Baloncesto",bal);
        intent.putExtra("Si",si);
        intent.putExtra("No",no);
        startActivity(intent);


    }
}
