package com.eguizabal.laboratorio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Juego juego;
    private String auxString;
    private TextView aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        juego = new Juego();
    }

    public void juegoJ1(View v){
        Integer i;
        i=juego.getSet();
        juego.puntoJ1();
        auxString = juego.getJuegoJ1();
        if(i==1){
            aux = findViewById(R.id.set1_j1);
            aux.setText(auxString);
        }
        if(i==2){
            aux = findViewById(R.id.set2_j1);
            aux.setText(auxString);
        }
        if(i==3){
            aux = findViewById(R.id.set3_j1);
            aux.setText(auxString);
        }
        if(i==4){
            aux = findViewById(R.id.set4_j1);
            aux.setText(auxString);
        }
        if(i==5){
            aux = findViewById(R.id.set5_j1);
            aux.setText(auxString);
        }
        if(i==6){
            aux = findViewById(R.id.set6_j1);
            aux.setText(auxString);
        }
        if(i==7){
            aux = findViewById(R.id.set7_j1);
            aux.setText(auxString);
        }
    }

    public void juegoJ2(View v){
        Integer i;
        i=juego.getSet();
        juego.puntoJ1();
        auxString = juego.getJuegoJ2();
        if(i==1){
            aux = findViewById(R.id.set1_j2);
            aux.setText(auxString);
        }
        if(i==2){
            aux = findViewById(R.id.set2_j2);
            aux.setText(auxString);
        }
        if(i==3){
            aux = findViewById(R.id.set3_j2);
            aux.setText(auxString);
        }
        if(i==4){
            aux = findViewById(R.id.set4_j2);
            aux.setText(auxString);
        }
        if(i==5){
            aux = findViewById(R.id.set5_j2);
            aux.setText(auxString);
        }
        if(i==6){
            aux = findViewById(R.id.set6_j2);
            aux.setText(auxString);
        }
        if(i==7){
            aux = findViewById(R.id.set7_j2);
            aux.setText(auxString);
        }
    }




}
