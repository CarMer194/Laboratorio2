package com.eguizabal.laboratorio2;

import android.widget.TextView;

/**
 * Created by Carlos on 22/3/2018.
 */

class Juego {
    private Integer set;
    private String juegoJ1, juegoJ2;
    private int contadorJ1=0, contadorJ2=0, juegoG1, juegoG2, setJ1,setJ2, win;
    private boolean deuce, tie, ganador;
    private TextView aux;

    public Juego() {
        set = 1;
        juegoJ1 = "-";
        juegoJ2 = "-";
        deuce=false;
        juegoG1=0;
        juegoG2=0;
        tie=false;
        setJ1=0;
        setJ2=0;
        ganador=false;
        win=0;
    }

    public Integer getSet() {
        return set;
    }

    public String getJuegoJ1() {
        return juegoJ1;
    }

    public String getJuegoJ2() {
        return juegoJ2;
    }

    public void setSet(Integer set) {
        this.set = set;
    }

    public void setJuegoJ1(String juegoJ1) {
        this.juegoJ1 = juegoJ1;
    }

    public void setJuegoJ2(String juegoJ2) {
        this.juegoJ2 = juegoJ2;
    }

    public int getJuegoG1() {
        return juegoG1;
    }

    public int getJuegoG2() {
        return juegoG2;
    }

    public void puntoJ1(){
        contadorJ1++;
        if (deuce && contadorJ2==4){
            contadorJ2--;
        }
        if (contadorJ1==1){
            juegoJ1 = "15";
        }
        if (contadorJ1==2){
            juegoJ1 = "30";
        }
        if (contadorJ1==3){
            juegoJ1 = "40";
        }
        if (contadorJ1==3 && contadorJ2==3){
            deuce = true;
            juegoJ1="40";
            juegoJ2="40";
        }
        if (deuce && contadorJ1==4){
            juegoJ1="AD";
            contadorJ2--;
            juegoJ2="-";
        }
        if (contadorJ1==5 && deuce){
            juegoJ1="-";
            juegoJ2="-";
            deuce=false;
            contadorJ2=0;
            contadorJ1=0;
            juegoG1++;
        }
        if (contadorJ1==4 && !deuce){
            juegoJ1="-";
            juegoJ2="-";
            contadorJ1=0;
            contadorJ2=0;
            juegoG1++;
        }
    }

    public void puntoJ2(){
        contadorJ2++;
        if (deuce && contadorJ1==4){
            contadorJ1--;
        }
        if (contadorJ2==1){
            juegoJ2 = "15";
        }
        if (contadorJ2==2){
            juegoJ2 = "30";
        }
        if (contadorJ2==3){
            juegoJ2 = "40";
        }
        if (contadorJ1==3 && contadorJ2==3){
            deuce = true;
            juegoJ2="40";
            juegoJ1="40";
        }
        if (deuce && contadorJ2==4){
            juegoJ2="AD";
            juegoJ1="-";
            contadorJ1--;
        }
        if (contadorJ2==5 && deuce){
            juegoJ1="-";
            juegoJ2="-";
            deuce=false;
            contadorJ2=0;
            contadorJ1=0;
            juegoG2++;
        }
        if (contadorJ2==4 && !deuce){
            juegoJ1="-";
            juegoJ2="-";
            contadorJ2=0;
            contadorJ1=0;
            juegoG2++;
        }
    }

    protected void terminarSet(){
        if(juegoG1==6 && juegoG2<5){
            set++;
            juegoG1=0;
            juegoG2=0;
            contadorJ2=0;
            contadorJ1=0;
            setJ1++;
        }
        if(juegoG2==6 && juegoG1<5){
            set++;
            juegoG1=0;
            juegoG2=0;
            contadorJ2=0;
            contadorJ1=0;
            setJ2++;
        }
        if(juegoG1==7 || juegoG2==7){
            set++;
            juegoG1=0;
            juegoG2=0;
            contadorJ2=0;
            contadorJ1=0;
            if (juegoG1==7){
                setJ1++;
            }
            if (getJuegoG2()==7){
                setJ2++;
            }
        }
        winner();
    }
    protected void winner(){

        if (setJ1==4){
            ganador=true;
            win=1;
        }
        if (setJ2==4){
            ganador=true;
            win=2;
        }
    }

    public boolean isGanador() {
        return ganador;
    }

    public int getWin() {
        return win;
    }
}
