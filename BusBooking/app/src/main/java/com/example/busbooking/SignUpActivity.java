package com.example.busbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
    }

    public void onClickPassenger(View view){
        Intent intent = new Intent(SignUpActivity.this, SignUpDetailAddingActivity.class);
        intent.putExtra("category", "passenger");
        startActivity(intent);
    }

    public void onClickBusOwner(View view){
        Intent intent = new Intent(SignUpActivity.this, ProvidingBusDetailsActivity.class);
        startActivity(intent);
    }

    public void onClickDriver(View view){
        Intent intent = new Intent(SignUpActivity.this, RegisterBusDriverActivity.class);
        startActivity(intent);
    }
}