package com.example.entregable;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class ReservaciondemesaActivity extends AppCompatActivity {

    private TextView textViewSelectedDate;
    private TextView textViewSelectedTime;
    private CalendarView calendarView;
    private Spinner spinnerTables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservaciondemesa);

        textViewSelectedDate = findViewById(R.id.textViewSelectedDate);
        textViewSelectedTime = findViewById(R.id.textViewSelectedTime);
        calendarView = findViewById(R.id.calendarView);
        spinnerTables = findViewById(R.id.spinnerTables);

        // Configuración del Spinner (ComboBox) con mesas disponibles
        String[] mesas = {"Mesa 1 - Código A", "Mesa 2 - Código B", "Mesa 3 - Código C", "Mesa 4 - Código D"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, mesas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTables.setAdapter(adapter);

        // Mostrar el calendario al hacer clic en el botón
        Button buttonShowCalendar = findViewById(R.id.buttonShowCalendar);
        buttonShowCalendar.setOnClickListener(v -> {
            calendarView.setVisibility(calendarView.getVisibility() == CalendarView.GONE ? CalendarView.VISIBLE : CalendarView.GONE);
        });

        // Listener para el calendario
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            // Mostrar la fecha seleccionada
            textViewSelectedDate.setText("Fecha seleccionada: " + dayOfMonth + "/" + (month + 1) + "/" + year);
        });

        // Mostrar el selector de hora al hacer clic en el botón
        Button buttonShowTimePicker = findViewById(R.id.buttonShowTimePicker);
        buttonShowTimePicker.setOnClickListener(v -> {
            // Obtener la hora y minuto actuales
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);

            // Crear el TimePickerDialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(ReservaciondemesaActivity.this,
                    (TimePicker view, int selectedHour, int selectedMinute) -> {
                        // Mostrar la hora seleccionada
                        textViewSelectedTime.setText("Hora seleccionada: " + selectedHour + ":" + (selectedMinute < 10 ? "0" + selectedMinute : selectedMinute));
                    }, hour, minute, true);
            timePickerDialog.show();
        });

        // Redirigir a reportereservarmesa.xml al hacer clic en el botón "Reservar Mesa"
        Button buttonReservarMesa = findViewById(R.id.button8);
        buttonReservarMesa.setOnClickListener(v -> {
            Intent intent = new Intent(ReservaciondemesaActivity.this, ReporteReservarMesaActivity.class);
            startActivity(intent);
        });
    }
}
