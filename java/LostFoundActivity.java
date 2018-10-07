package com.shazam.optimistic.collegebuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class LostFoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_found);

        final RadioButton lost = findViewById(R.id.lost);
        final RadioButton found = findViewById(R.id.found);

        final EditText place = findViewById(R.id.place);

        final EditText desc = findViewById(R.id.desc);

        Button reportlf = findViewById(R.id.reportlf);
        reportlf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(lost.isChecked()||found.isChecked()) {
                    if (!desc.getText().toString().equals("")) {
                        if (!place.getText().toString().equals("")) {
                            Toast.makeText(LostFoundActivity.this, "Complaint recorded", Toast.LENGTH_SHORT).show();
                            finish();
                        } else {
                            place.setError("Field Mandatory!");
                        }
                    } else {
                        desc.setError("Field Mandatory!");
                    }
                }
                else{
                    Toast.makeText(LostFoundActivity.this, "Select Lost or Found!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
