package com.app.game.comecerebros;

import android.text.method.ScrollingMovementMethod;
import android.support.v7.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class QuienesSomosActivity extends AppCompatActivity {
    private View.OnClickListener PresentacionActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
            Intent intento_V = new Intent(QuienesSomosActivity.this, PresentacionActivity.class);
            startActivity(intento_V);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quienes_somos);

        //Para bloquear la pantalla en un solo formato
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Hacer que el TextView sea Scrolable
        TextView johan = findViewById(R.id.informacionJohan);
        johan.setMovementMethod(new ScrollingMovementMethod());
        TextView christian = findViewById(R.id.informacionChristian);
        christian.setMovementMethod(new ScrollingMovementMethod());

        //Boton de Cambio de Layout a Presentacion
        Button volver = findViewById(R.id.botonVolver_QS);
        volver.setOnClickListener(PresentacionActivity);
    }
}