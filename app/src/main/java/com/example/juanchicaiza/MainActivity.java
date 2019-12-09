package com.example.juanchicaiza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user, password;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=(EditText)findViewById(R.id.etUsuario);
        password=(EditText)findViewById(R.id.etContrasena);
        ingresar=(Button)findViewById(R.id.btnIngreso);

    }

    public void login(View view){
        String usuario="estudiante2019", contraseña="uisrael2019";
        String login1=user.getText().toString();
        String login2=password.getText().toString();
        if( login1.equals(usuario)&&login2.equals(contraseña)){
            Toast.makeText(getApplicationContext(),"Ha Iniciado sesión correctamente",Toast.LENGTH_SHORT).show();
            Intent intent= new Intent(MainActivity.this,Registro.class);
            startActivity(intent);
        }

        else
            Toast.makeText(getApplicationContext(),"Usuario o contraseña incorrectos",Toast.LENGTH_SHORT).show();
    }
}
