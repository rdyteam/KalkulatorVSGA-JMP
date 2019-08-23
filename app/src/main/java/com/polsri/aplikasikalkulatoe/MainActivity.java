package com.polsri.aplikasikalkulatoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView hasil;
    EditText nmr1,nmr2;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasil = (TextView) findViewById(R.id.hasil);
        nmr1 = (EditText) findViewById(R.id.nmr1);
        nmr2 = (EditText) findViewById(R.id.nmr2);

    }
    public void hasilTambah( View v ){
        String satu1 = nmr1.getText().toString().trim();
        String dua2 = nmr2.getText().toString().trim();

        Double satu = toDouble(satu1);
        Double dua = toDouble(dua2);
        double jumlah = satu + dua;
        hasil.setText(String.valueOf(jumlah));
    }
    public void hasilKurang( View v ){
        String satu1 = nmr1.getText().toString().trim();
        String dua2 = nmr2.getText().toString().trim();

        Double satu = toDouble(satu1);
        Double dua = toDouble(dua2);
        double jumlah = satu - dua;
        hasil.setText(String.valueOf(jumlah));
    }
    public void hasilKali( View v ){
        String satu1 = nmr1.getText().toString().trim();
        String dua2 = nmr2.getText().toString().trim();

        Double satu = toDouble(satu1);
        Double dua = toDouble(dua2);
        double jumlah = satu * dua;
        hasil.setText(String.valueOf(jumlah));
    }
    public void hasilbagi( View v ){
        String satu1 = nmr1.getText().toString().trim();
        String dua2 = nmr2.getText().toString().trim();

        Double satu = toDouble(satu1);
        Double dua = toDouble(dua2);
        double jumlah = satu / dua;
        hasil.setText(String.valueOf(jumlah));
    }

    public void bersih( View v ){
        nmr1.setText("");
        nmr2.setText("");
        hasil.setText("0");
    }



    private Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
