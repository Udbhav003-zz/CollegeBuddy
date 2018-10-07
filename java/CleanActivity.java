package com.shazam.optimistic.collegebuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class CleanActivity extends AppCompatActivity {

    Spinner branch,sem,section;
    String item1,item2,item3;
    ArrayList<String> branches,semester,sec;
    Button report;

    void init(){
        branch = findViewById(R.id.branch);
        sem = findViewById(R.id.sem);
        section = findViewById(R.id.section);
        report = findViewById(R.id.report);

    }

    void setupBranch(){
        branches = new ArrayList<String>();
        branches.add("Computer Science");
        branches.add("Information Technology");
        branches.add("Electrical and Electronics");
        branches.add("Electronics and Communication");
        branches.add("Mechanical");
        branches.add("Biotechnology");
    }

    void setupSem(){
        semester = new ArrayList<String>();
        semester.add("I");
        semester.add("II");
        semester.add("III");
        semester.add("IV");
        semester.add("V");
        semester.add("VI");
        semester.add("VII");
        semester.add("VIII");
    }

    void setupSec(){
        sec = new ArrayList<>();
        sec.add("A");
        sec.add("B");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean);

        init();

        setupBranch();
        setupSem();
        setupSec();

        branch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item1 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, branches);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branch.setAdapter(dataAdapter1);

        sem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item2 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, semester);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sem.setAdapter(dataAdapter2);

        section.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item3 = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sec);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        section.setAdapter(dataAdapter3);

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CleanActivity.this,"Complaint recorded",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
