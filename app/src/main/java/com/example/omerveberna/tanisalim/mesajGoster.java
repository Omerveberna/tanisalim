package com.example.omerveberna.tanisalim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class mesajGoster extends AppCompatActivity {
    TextView tvIsim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesaj_goster);


        Intent intent=getIntent();
        String isim=intent.getStringExtra(MainActivity.INTENT_ANAHTAR);

        tvIsim=(TextView) findViewById(R.id.tvIsim);
        tvIsim.setText("Merhaba "+isim+", tanıştığıma memnun oldum!");

    }
}