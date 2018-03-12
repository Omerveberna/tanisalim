package com.example.omerveberna.tanisalim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String  INTENT_ANAHTAR="anahtarIsim";
    EditText etIsim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etIsim=(EditText) findViewById(R.id.etIsim);
    }
    public  void mesajGonder(View view){
        Intent intent=new Intent(this,mesajGoster.class)
                .putExtra(INTENT_ANAHTAR,etIsim.getText().toString());

        startActivity(intent);
    }
}
