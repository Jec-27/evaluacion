package com.example.entregable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AccesoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceso); // Aquí se hace referencia al archivo XML de la actividad de acceso

        // Encuentra los botones por su ID
        Button registrarButton = findViewById(R.id.button2);
        Button accederButton = findViewById(R.id.button3);

        // Establece el listener para el botón de registrar
        registrarButton.setOnClickListener(v -> {
            // Redirige a la actividad de Registro Personal (RegistropersonalActivity)
            Intent intent = new Intent(AccesoActivity.this, RegistropersonalActivity.class);
            startActivity(intent);
        });

        // Establece el listener para el botón de acceder a cuenta
        accederButton.setOnClickListener(v -> {
            // Redirige a la actividad de Solicitar Reserva (SolicitarreservaActivity)
            Intent intent = new Intent(AccesoActivity.this, SolicitarreservaActivity.class);
            startActivity(intent);
        });
    }
}
