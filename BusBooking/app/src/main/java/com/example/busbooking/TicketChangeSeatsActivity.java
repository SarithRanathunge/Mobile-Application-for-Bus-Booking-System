package com.example.busbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TicketChangeSeatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ticket_change_seats);
    }

    public void onClickGoUser(View view){
        Intent intent = new Intent(TicketChangeSeatsActivity.this, UserActionsActivity.class);
        startActivity(intent);
    }

    public void onClickGoHome(View view){
        Intent intent = new Intent(TicketChangeSeatsActivity.this, PassengerHomeSelectBusActivity.class);
        startActivity(intent);
    }

    public void onClickChangeSeat(View view){
        Intent intent = new Intent(TicketChangeSeatsActivity.this, TicketBookingsActivity.class);
        startActivity(intent);
    }


}