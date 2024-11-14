package com.example.busbooking;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserActionsActivity extends AppCompatActivity {

    Dialog dialogPassword, dialogLogOut;
    Button resetPassword, reset, logOut, yes, no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_actions);

        dialogPassword = new Dialog(UserActionsActivity.this);
        dialogPassword.setContentView(R.layout.reset_password);
        dialogPassword.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialogPassword.getWindow().setBackgroundDrawable(getDrawable(R.drawable.custom_dialog_box));

        resetPassword = findViewById(R.id.resetPassword);
        reset = dialogPassword.findViewById(R.id.reset);

        resetPassword.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPassword.show();
            }
        }));

        reset.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPassword.dismiss();
            }
        }));

        dialogLogOut = new Dialog(UserActionsActivity.this);
        dialogLogOut.setContentView(R.layout.log_out);
        dialogLogOut.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialogLogOut.getWindow().setBackgroundDrawable(getDrawable(R.drawable.custom_dialog_box));
        dialogLogOut.setCancelable(false);

        logOut = findViewById(R.id.logOut);
        yes = dialogLogOut.findViewById(R.id.yes);
        no = dialogLogOut.findViewById(R.id.no);

        logOut.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogLogOut.show();
            }
        }));

        yes.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActionsActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        }));

        no.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogLogOut.dismiss();
            }
        }));
    }

    public void onClickGoTicket(View view){
        Intent intent = new Intent(UserActionsActivity.this, TicketBookingsActivity.class);
        startActivity(intent);
    }

    public void onClickGoHome(View view){
        Intent intent = new Intent(UserActionsActivity.this, PassengerHomeSelectBusActivity.class);
        startActivity(intent);
    }

    public void onClickUserEdit(View view){
        Intent intent = new Intent(UserActionsActivity.this, UserEditActivity.class);
        startActivity(intent);
    }
}