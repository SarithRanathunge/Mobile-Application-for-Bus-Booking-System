package com.example.busbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TicketBookingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ticket_bookings);
    }

    public void onClickGoUser(View view){
        Intent intent = new Intent(TicketBookingsActivity.this, UserActionsActivity.class);
        startActivity(intent);
    }

    public void onClickGoHome(View view){
        Intent intent = new Intent(TicketBookingsActivity.this, PassengerHomeSelectBusActivity.class);
        startActivity(intent);
    }

    public void onClickChangeSeat(View view){
        Intent intent = new Intent(TicketBookingsActivity.this, TicketChangeSeatsActivity.class);
        startActivity(intent);
    }
}