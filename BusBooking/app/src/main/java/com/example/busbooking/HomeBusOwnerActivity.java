package com.example.busbooking;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HomeBusOwnerActivity extends AppCompatActivity {

    Dialog dialog;
    Button edit, editDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_bus_owner);

        dialog = new Dialog(HomeBusOwnerActivity.this);
        dialog.setContentView(R.layout.bus_edit_details);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.custom_dialog_box));

        edit = findViewById(R.id.changeSeat);
        editDetails = dialog.findViewById(R.id.editDetails);

        edit.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        }));

        editDetails.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        }));
    }

    public void onClickGoUser(View view){
        Intent intent = new Intent(HomeBusOwnerActivity.this, UserActionsActivity.class);
        startActivity(intent);
    }
}