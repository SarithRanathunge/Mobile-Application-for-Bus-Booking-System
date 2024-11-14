package com.example.busbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeBusDriverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_bus_driver);
    }

//    public void onClickGoTicket(View view){
//        Intent intent = new Intent(HomeBusDriverActivity.this, TicketBookingsActivity.class);
//        startActivity(intent);
//    }

    public void onClickGoUser(View view){
        Intent intent = new Intent(HomeBusDriverActivity.this, UserActionsActivity.class);
        startActivity(intent);
    }
}