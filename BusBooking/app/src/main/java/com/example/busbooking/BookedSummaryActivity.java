package com.example.busbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BookedSummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_booked_summary);
    }

    public void onClickGoUser(View view){
        Intent intent = new Intent(BookedSummaryActivity.this, UserActionsActivity.class);
        startActivity(intent);
    }

    public void onClickGoTicket(View view){
        Intent intent = new Intent(BookedSummaryActivity.this, TicketBookingsActivity.class);
        startActivity(intent);
    }
}