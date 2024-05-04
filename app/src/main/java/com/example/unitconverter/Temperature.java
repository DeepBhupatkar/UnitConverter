package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Temperature extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar toolbar;
    TextView convert_from, convert_to, answer;
    EditText amount;
    ArrayList<String> arrayList;
    Dialog fromDialog;
    Dialog toDialog;
    Button convert;
    String convertFromValue, convertToValue, conversionValue;
    String[] temperature={"Celsius", "Fahrenheit", "Kelvin", "Rankine", "Newton", "Reaumur", "Romer", "Delisle"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        getWindow().setStatusBarColor(Color.BLACK);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        convert_from = findViewById(R.id.convert_from);
        convert_to = findViewById(R.id.convert_to);
        convert = findViewById(R.id.convert);
        answer = findViewById(R.id.answer);
        amount = findViewById(R.id.amount);

        arrayList = new ArrayList<>();

        Collections.addAll(arrayList, temperature);

        convert_from.setOnClickListener(v -> {
            fromDialog = new Dialog(Temperature.this);
            fromDialog.setContentView(R.layout.from_spinner);
            fromDialog.getWindow().setLayout(650,800);
            fromDialog.show();

            EditText editText = fromDialog.findViewById(R.id.fedittext);
            ListView listView = fromDialog.findViewById(R.id.flistview);

            ArrayAdapter<String> adapter = new ArrayAdapter<>(Temperature.this, android.R.layout.simple_list_item_1,arrayList);
            listView.setAdapter(adapter);

            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    adapter.getFilter().filter(s);
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
            listView.setOnItemClickListener((parent, view, position, id) -> {
                convert_from.setText(adapter.getItem(position));
                fromDialog.dismiss();
                convertFromValue = adapter.getItem(position);
            });

        });

        convert_to.setOnClickListener(v -> {
            toDialog = new Dialog(Temperature.this);
            toDialog.setContentView(R.layout.to_spinner);
            toDialog.getWindow().setLayout(650,800);
            toDialog.show();

            EditText editText = toDialog.findViewById(R.id.tedittext);
            ListView listView = toDialog.findViewById(R.id.tlistview);

            ArrayAdapter<String> adapter = new ArrayAdapter<>(Temperature.this, android.R.layout.simple_list_item_1,arrayList);
            listView.setAdapter(adapter);

            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    adapter.getFilter().filter(s);
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
            listView.setOnItemClickListener((parent, view, position, id) -> {
                convert_to.setText(adapter.getItem(position));
                toDialog.dismiss();
                convertToValue = adapter.getItem(position);
            });

        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double amount = Double.valueOf(Temperature.this.amount.getText().toString());
                    answer.setText(getConversion(convertFromValue,convertToValue,amount));
                }
                catch (Exception e){
                    Toast.makeText(Temperature.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public String getConversion(String convertFrom, String convertTo, Double amount){

        String answer="0";
        // Celsius, Fahrenheit , Kelvin , Rankine , Newton , Reaumur , Romer , Delisle


        if(convertFrom.contains("Celsius") && convertTo.contains("Celsius")){
            //amount
            answer = String.valueOf(amount);
        }
        else if(convertFrom.contains("Celsius") && convertTo.contains("Fahrenheit")){
            //Formula: °F = (°C × 9/5) + 32
            answer = String.valueOf((amount * 9 / 5) + 32);
        }
        else if(convertFrom.contains("Celsius") && convertTo.contains("Kelvin")){
            //Formula: K = °C + 273.15
            answer = String.valueOf(amount + 273.15);
        }
        else if(convertFrom.contains("Celsius") && convertTo.contains("Rankine")){
            //Formula: °R = (°C + 273.15) × 9/5
            answer = String.valueOf((amount + 273.15) * 9/5);
        }
        else if(convertFrom.contains("Celsius") && convertTo.contains("Newton")){
            //Formula: °N = °C × 33/100
            answer = String.valueOf(amount * 33 / 100);
        }
        else if(convertFrom.contains("Celsius") && convertTo.contains("Reaumur")){
            //answer = String.valueOf();
        }
        else if(convertFrom.contains("Celsius") && convertTo.contains("Romer")){
            //answer = String.valueOf();
        }
        else if(convertFrom.contains("Celsius") && convertTo.contains("Delisle")){
            //answer = String.valueOf();
        }





        return answer;
    }

}