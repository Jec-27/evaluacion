package com.example.entregable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SolicitarreservaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solicitarreserva); // Aquí se hace referencia al archivo XML de la actividad de solicitar reserva

        // Encuentra los botones por su ID
        ImageButton imagen1Button = findViewById(R.id.imageButton);
        ImageButton imagen2Button = findViewById(R.id.imageButton2); // Este está deshabilitado, por lo que no necesita ser manejado
        Button cerrarSesionButton = findViewById(R.id.button7);

        // Establece el listener para el botón de "Imagen 1"
        imagen1Button.setOnClickListener(v -> {
            // Redirige a la actividad de Reservación de Mesa (ReservaciondemesaActivity)
            Intent intent = new Intent(SolicitarreservaActivity.this, ReservaciondemesaActivity.class);
            startActivity(intent);
        });

        // Deshabilitar el botón de "Imagen 2" (Este ya lo está en el XML con un comportamiento predeterminado)
        imagen2Button.setEnabled(false); // Si no está ya deshabilitado en el XML, lo deshabilitamos desde aquí

        // Establece el listener para el botón de "Cerrar Sesión"
        cerrarSesionButton.setOnClickListener(v -> {
            // Redirige a la actividad de Acceso (AccesoActivity)
            Intent intent = new Intent(SolicitarreservaActivity.this, AccesoActivity.class);
            startActivity(intent);
        });
    }
}
