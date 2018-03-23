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
        juego.puntoJ1();
        actualizarMarcador();
        actualizarSetJ1();
        auxString="";
        juego.terminarSet();

    }
    public void juegoJ2(View v){
        juego.puntoJ2();
        actualizarMarcador();
        actualizarSetJ2();
        auxString="";
        juego.terminarSet();
    }

    public void actualizarSetJ1(){
        Integer i,j;
        i=juego.getSet();
        j=juego.getJuegoG1();
        if(i==1){
            aux = findViewById(R.id.set1_j1);
            aux.setText(j.toString());
        }
        if(i==2){
            aux = findViewById(R.id.set2_j1);
            aux.setText(j.toString());
        }
        if(i==3){
            aux = findViewById(R.id.set3_j1);
            aux.setText(j.toString());
        }
        if(i==4){
            aux = findViewById(R.id.set4_j1);
            aux.setText(j.toString());
        }
        if(i==5){
            aux = findViewById(R.id.set5_j1);
            aux.setText(j.toString());
        }
        if(i==6){
            aux = findViewById(R.id.set6_j1);
            aux.setText(j.toString());
        }
        if(i==7){
            aux = findViewById(R.id.set7_j1);
            aux.setText(j.toString());
        }
    }

    public void actualizarSetJ2(){
        Integer i,j;
        i=juego.getSet();
        j=juego.getJuegoG2();
        if(i==1){
            aux = findViewById(R.id.set1_j2);
            aux.setText(j.toString());
        }
        if(i==2){
            aux = findViewById(R.id.set2_j2);
            aux.setText(j.toString());
        }
        if(i==3){
            aux = findViewById(R.id.set3_j2);
            aux.setText(j.toString());
        }
        if(i==4){
            aux = findViewById(R.id.set4_j2);
            aux.setText(j.toString());
        }
        if(i==5){
            aux = findViewById(R.id.set5_j2);
            aux.setText(j.toString());
        }
        if(i==6){
            aux = findViewById(R.id.set6_j2);
            aux.setText(j.toString());
        }
        if(i==7){
            aux = findViewById(R.id.set7_j2);
            aux.setText(j.toString());
        }
    }

    public void actualizarMarcador(){
        auxString=juego.getJuegoJ1();
        aux=findViewById(R.id.juego_j1);
        aux.setText(auxString);

        auxString=juego.getJuegoJ2();
        aux=findViewById(R.id.juego_j2);
        aux.setText(auxString);

    }

    public void borrar(View v){
        juego = new Juego();

    }




}
