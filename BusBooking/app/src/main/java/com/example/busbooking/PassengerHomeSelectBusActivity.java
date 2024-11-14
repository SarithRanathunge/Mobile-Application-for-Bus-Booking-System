package com.example.busbooking;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class PassengerHomeSelectBusActivity extends AppCompatActivity {

    final Calendar myCalendar = Calendar.getInstance();
    EditText calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_passenger_home_select_bus);

        calendar = findViewById(R.id.dob);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(PassengerHomeSelectBusActivity.this, new DatePickerDialog.OnDateSetListener(){

                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        myCalendar.set(Calendar.YEAR, year);
                        myCalendar.set(Calendar.MONTH, month);
                        myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                        String myFormat = "dd-MMM-yyyy";
                        SimpleDateFormat dateFormat = new SimpleDateFormat(myFormat, Locale.US);
                        calendar.setText(dateFormat.format(myCalendar.getTime()));
                    }
                },myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });
    }

    public void onClickGoUser(View view){
        Intent intent = new Intent(PassengerHomeSelectBusActivity.this, UserActionsActivity.class);
        startActivity(intent);
    }

    public void onClickGoTicket(View view){
        Intent intent = new Intent(PassengerHomeSelectBusActivity.this, TicketBookingsActivity.class);
        startActivity(intent);
    }

    public void onClickSelect(View view){
        Intent intent = new Intent(PassengerHomeSelectBusActivity.this, PassenegerHomeSelectedBusActivity.class);
        startActivity(intent);
    }
}