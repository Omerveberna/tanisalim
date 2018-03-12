package com.example.omerveberna.tanisalim;

import android.content.Intent;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.List;

import static java.net.Proxy.Type.HTTP;

public class mesajGoster extends AppCompatActivity {
    TextView tvIsim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesaj_goster);


        Intent intent = getIntent();
        String isim = intent.getStringExtra(MainActivity.INTENT_ANAHTAR);

        tvIsim = (TextView) findViewById(R.id.tvIsim);
        tvIsim.setText("Merhaba " + isim + ", tanıştığıma memnun oldum!");
    }

    public void goruselim(View view) {
        Uri number = Uri.parse("tel:05396200711");
        Intent aramaIntent = new Intent(Intent.ACTION_DIAL, number);

        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(aramaIntent, 0);
        boolean isIntentSafe = activities.size() > 0;

        if (isIntentSafe) startActivity(aramaIntent);

    }

    public void gelecegiYazanlaraGit(View view) {
        Uri webpage = Uri.parse("https://gelecegiyazanlar.turkcell.com.tr/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        String baslik = "Hangi browser’ı kullanmak istiyorsunuz?";
// seçici ekranı göstermek için Intent oluşturuyoruz
        Intent chooser = Intent.createChooser(webIntent, baslik);
// Intent'in en az bir Activity çözümleneceğini doğruluyoruz

        startActivity(chooser);
    }



    }





