package com.example.entregable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ReporteReservarMesaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reportereservarmesa); // Hace referencia al archivo XML de la actividad de ReporteReservarMesaActivity

        // Encuentra el botón por su ID
        Button iniciarSesionButton = findViewById(R.id.button8);

        // Establece el listener para el botón "Reservar Mesa"
        iniciarSesionButton.setOnClickListener(v -> {
            // Redirige a la actividad "re"
            Intent intent = new Intent(ReporteReservarMesaActivity.this, re.class);
            startActivity(intent);
        });
    }
}
