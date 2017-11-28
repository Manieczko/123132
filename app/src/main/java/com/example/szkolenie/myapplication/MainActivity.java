package com.example.szkolenie.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch przelacznik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button kamol=findViewById(R.id.button);
       przelacznik=findViewById(R.id.switch1);

zmienNazwe(kamol,"tekst");
//......................................................
        kamol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (przelacznik.isChecked()) {
                    Intent komunikat=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(komunikat);
                } else {
                    Toast chmurka=Toast.makeText(MainActivity.this,"Pierw przełącz przełącznik",Toast.LENGTH_LONG);
                    chmurka.show();
                }



            }

    });
        Button button2=findViewById(R.id.button2);
        zmienNazwe(button2,"tekst2");
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cham2= (new Intent(MainActivity.this, snieg.class));
                startActivity(cham2);
             }});








    } protected void zmienNazwe  (Button kamol,CharSequence tekst){
        kamol.setText(tekst);


    }







}


