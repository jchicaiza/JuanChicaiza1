package com.example.juanchicaiza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Resumen extends AppCompatActivity {

    EditText usuarioConectado, nombreConectado, resumen, respuestaFut, respuestaTen, respuestaBalo,
            respuestaSi;
    Button regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        usuarioConectado=findViewById(R.id.etUContectado);
        nombreConectado=findViewById(R.id.etNombreCon);

        resumen=findViewById(R.id.etRespuesta);
        respuestaFut=findViewById(R.id.etFut);
        respuestaTen=findViewById(R.id.etTen);
        respuestaBalo=findViewById(R.id.etBalo);
        respuestaSi=findViewById(R.id.etSiNo);
        regresar=findViewById(R.id.btnRegresar);


        String recibirNombre = getIntent().getStringExtra("Juan");

        String recibirRes = getIntent().getStringExtra("");
        String recibirFut = getIntent().getStringExtra("");
        String recibirTen = getIntent().getStringExtra("");
        String recibirBalo = getIntent().getStringExtra("");
        String recibirSiNo = getIntent().getStringExtra("");

        usuarioConectado.setText(recibirNombre);

        resumen.setText(recibirRes);
        respuestaFut.setText(recibirFut);
        respuestaTen.setText(recibirTen);
        respuestaBalo.setText(recibirBalo);
        respuestaSi.setText(recibirSiNo);

    }
    public void regresar (View view){
        Intent intent = new Intent(Resumen.this, Encuesta.class);
        startActivity(intent);
    }


}
