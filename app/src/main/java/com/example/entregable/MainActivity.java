package com.example.entregable;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Encuentra el botón por su ID
        Button accesoButton = findViewById(R.id.button);

        // Establece el listener para el clic del botón
        accesoButton.setOnClickListener(v -> {
            // Crea un intent para iniciar la nueva actividad (AccesoActivity)
            Intent intent = new Intent(MainActivity.this, AccesoActivity.class);
            startActivity(intent);
        });

        // Establecer el listener para la aplicación de los márgenes del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
