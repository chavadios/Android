package com.developing.iamlam.a05_intent_explicito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv=findViewById(R.id.textViewMS);
//se recuperan los valores desde el primer activity
        Bundle b= getIntent().getExtras();
        if(b!=null&&b.get("saludo")!=null){
            String saludo=b.getString("saludo");

            Toast.makeText(SecondActivity.this,saludo,Toast.LENGTH_LONG).show();
            tv.setText(saludo);

        }else {


            Toast.makeText(SecondActivity.this,"Ningun valor fue enviado",Toast.LENGTH_LONG).show();
        }




    }
}
