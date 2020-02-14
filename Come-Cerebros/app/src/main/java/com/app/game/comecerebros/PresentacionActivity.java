package com.app.game.comecerebros;

import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.content.pm.ActivityInfo;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

//Hay que implementar el OnclickListener para poder usar el Onclick en varios botones
public class PresentacionActivity extends AppCompatActivity implements OnClickListener {
    //Metodo de Cambio de Layouts
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.botonJugar:
                //Cambio de Layouts Quienes Jugar
                finish();
                Intent intento_J = new Intent(PresentacionActivity.this, JugarActivity.class);
                startActivity(intento_J);
                break;
            case R.id.botonNosotros:
                //Cambio de Layouts Quienes Somos
                finish();
                Intent intento_N = new Intent(PresentacionActivity.this, QuienesSomosActivity.class);
                startActivity(intento_N);
                break;
            case R.id.botonSalir:
                AlertDialog.Builder advertencia = new AlertDialog.Builder(this);
                advertencia.setMessage("Esta seguro que quiere salir?")
                        .setTitle("Saliendo...")
                        .setCancelable(false)
                        .setNegativeButton("Cancelar",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                })
                        .setPositiveButton("Salir.",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        finish();
                                        Intent intento_S = new Intent(Intent.ACTION_MAIN);
                                        intento_S.addCategory(Intent.CATEGORY_HOME);
                                        intento_S.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                        startActivity(intento_S);
                                    }
                                });
                AlertDialog alerta = advertencia.create();
                alerta.setIcon(R.drawable.salir);
                alerta.show();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

        //Para bloquear la pantalla en un solo formato
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // Botón de salida (final de la aplicación)
        Button salida = findViewById(R.id.botonSalir);
        salida.setOnClickListener(this);
        //Boton de Cambio de Layout a Quines Somos
        Button nosotros = findViewById(R.id.botonNosotros);
        nosotros.setOnClickListener(this);
        //Boton de Cambio de Layout a Jugar
        Button jugar = findViewById(R.id.botonJugar);
        jugar.setOnClickListener(this);
    }
}