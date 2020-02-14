package com.app.game.comecerebros;

import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.content.pm.ActivityInfo;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

//Hay que implementar el OnclickListener para poder usar el Onclick en varios botones
public class JugarActivity extends AppCompatActivity implements OnClickListener {
    //Metodo de Cambio de Layouts
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.botonFacil:
                //Cambio de Layouts Nivel Facil
                finish();
                Intent intento_F = new Intent(JugarActivity.this, FacilActivity.class);
                startActivity(intento_F);
                break;
            case R.id.botonAvanzado:
                //Cambio de layout Nivel Avanzado
                finish();
                Intent intento_A = new Intent(JugarActivity.this, AvanzadoActivity.class);
                startActivity(intento_A);
                break;
            case R.id.botonInstrucciones:
                //Cambio Layout a Instrucciones
                finish();
                Intent intento_I = new Intent(JugarActivity.this, InstruccionesActivity.class);
                startActivity(intento_I);
                break;
            case R.id.botonVolver_J:
                //Regreso a Layout Anterior
                finish();
                Intent intento_V = new Intent(JugarActivity.this, PresentacionActivity.class);
                startActivity(intento_V);
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);

        //Para bloquear la pantalla en un solo formato
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Boton de Cambio de Layout a Nivel Facil
        Button facil = findViewById(R.id.botonFacil);
        facil.setOnClickListener(this);
        //Boton de Cambio de Layout a Nivel Avanzado
        Button avanzado = findViewById(R.id.botonAvanzado);
        avanzado.setOnClickListener(this);
        //Boton de Cambio de Layout a Instrucciones
        Button instrucciones = findViewById(R.id.botonInstrucciones);
        instrucciones.setOnClickListener(this);
        //Boton de Cambio de Layout a Presentacion
        Button volver = findViewById(R.id.botonVolver_J);
        volver.setOnClickListener(this);
    }
}