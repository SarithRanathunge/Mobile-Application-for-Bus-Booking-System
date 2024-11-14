package com.example.busbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SelectSeatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_select_seat);
    }

    public void onClickGoUser(View view){
        Intent intent = new Intent(SelectSeatActivity.this, UserActionsActivity.class);
        startActivity(intent);
    }

    public void onClickGoTicket(View view){
        Intent intent = new Intent(SelectSeatActivity.this, TicketBookingsActivity.class);
        startActivity(intent);
    }

    public void onClickConfirm(View view){
        Intent intent = new Intent(SelectSeatActivity.this, BookedSummaryActivity.class);
        startActivity(intent);
    }
}