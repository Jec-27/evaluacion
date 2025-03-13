package com.example.entregable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class RegistropersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registropersonal); // Aquí se hace referencia al archivo XML de la actividad de registro

        // Encuentra los botones por su ID
        Button registrarButton = findViewById(R.id.button4);
        Button volverButton = findViewById(R.id.button5);

        // Establece el listener para el botón de registrar
        registrarButton.setOnClickListener(v -> {
            // Redirige a la actividad de Crear Usuario (CrearusuarioActivity)
            Intent intent = new Intent(RegistropersonalActivity.this, CrearusuarioActivity.class);
            startActivity(intent);
        });

        // Establece el listener para el botón de volver
        volverButton.setOnClickListener(v -> {
            // Redirige a la actividad de Acceso (AccesoActivity)
            Intent intent = new Intent(RegistropersonalActivity.this, AccesoActivity.class);
            startActivity(intent);
        });
    }
}
