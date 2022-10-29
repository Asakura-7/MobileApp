package com.example.class_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class Spiner_Activity extends AppCompatActivity {
    TextInputLayout spinner;
    AutoCompleteTextView AutoText;
    TextView textCheck;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiner);

        init();
        ArrayList<String> name = new ArrayList<>(Arrays.asList("Bob", "Make", "John"));
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,name);


    }
    private void init() {
        spinner = findViewById(R.id.spinnerInput);
        AutoText = findViewById(R.id.autoText);
        textCheck = findViewById(R.id.checkText);
    }
}