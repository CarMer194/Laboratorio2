package com.eguizabal.laboratorio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView fstTxtView, sndTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cambiartexto(View v){
        String aux;
        fstTxtView = findViewById(R.id.den);
        sndTxtView = findViewById(R.id.ise);

        aux = sndTxtView.getText().toString();
        sndTxtView.setText(fstTxtView.getText());
        fstTxtView.setText(aux);
    }
}
