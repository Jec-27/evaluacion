package com.example.entregable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CrearusuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crearusuario); // Aquí hace referencia al archivo XML de la actividad de crear usuario

        // Encuentra el botón por su ID
        Button iniciarSesionButton = findViewById(R.id.button6);

        // Establece el listener para el botón "Inicie Sesion"
        iniciarSesionButton.setOnClickListener(v -> {
            // Redirige a la actividad de Acceso
            Intent intent = new Intent(CrearusuarioActivity.this, AccesoActivity.class);
            startActivity(intent);
        });
    }
}
