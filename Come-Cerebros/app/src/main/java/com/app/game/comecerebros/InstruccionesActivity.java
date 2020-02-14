package com.app.game.comecerebros;

import android.support.v7.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InstruccionesActivity extends AppCompatActivity {
    private View.OnClickListener JugarActivity = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
            Intent intento = new Intent(InstruccionesActivity.this, JugarActivity.class);
            startActivity(intento);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucciones);

        //Para bloquear la pantalla en un solo formato
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Boton de Cambio de Layout a Jugar
        Button volver = findViewById(R.id.botonVolver_QS);
        volver.setOnClickListener(JugarActivity);

        //Hacer que el TextView sea Scrolable
        TextView instrucciones = findViewById(R.id.etiquetaInstrcciones);
        instrucciones.setMovementMethod(new ScrollingMovementMethod());
    }
}