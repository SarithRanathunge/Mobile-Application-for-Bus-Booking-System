package com.example.busbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_edit);
    }

    public void onClickGoTicket(View view){
        Intent intent = new Intent(UserEditActivity.this, TicketBookingsActivity.class);
        startActivity(intent);
    }

    public void onClickGoHome(View view){
        Intent intent = new Intent(UserEditActivity.this, PassengerHomeSelectBusActivity.class);
        startActivity(intent);
    }

    public void onClickChangeDetails(View view){
        Intent intent = new Intent(UserEditActivity.this, UserActionsActivity.class);
        startActivity(intent);
    }
}