package com.app.game.comecerebros;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.os.CountDownTimer;
import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

import android.os.Vibrator;
import android.view.View;
import android.os.Bundle;

import java.util.Random;
import java.util.List;

public class AvanzadoActivity extends AppCompatActivity implements OnClickListener {
    List<String> resultados = new ArrayList<>();
    private MediaPlayer musica;
    final Context context = this;

    //Variables Cronometro
    Chronometer cronometro;
    Boolean actividad = false;
    Random numeroA, numeroB, numeroC, numeroD, simbolo;
    int numA, numB, numC, numD, simbolos;
    float contadorBuenas = 0;
    float contadorMalas = 0;
    String B_M;

    //Metodo Cargar Imagenes segun Numero
    private void Cargar() {
        //Numeros Randomicos
        numeroA = new Random();
        numeroB = new Random();
        numeroC = new Random();
        numeroD = new Random();
        simbolo = new Random();
        numA = numeroA.nextInt(10);
        numB = numeroA.nextInt(10);
        numC = numeroA.nextInt(10);
        numD = numeroA.nextInt(10);
        simbolos = simbolo.nextInt(4);
        //SIMBOLO
        if (simbolos == 0) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.mas);
            ImageView cargar = findViewById(R.id.imagenOperador);
            cargar.setImageDrawable(cargaImagen);
        }
        if (simbolos == 1) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.menos);
            ImageView cargar = findViewById(R.id.imagenOperador);
            cargar.setImageDrawable(cargaImagen);
        }
        if (simbolos == 2) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.multiplicacion);
            ImageView cargar = findViewById(R.id.imagenOperador);
            cargar.setImageDrawable(cargaImagen);
        }
        if (simbolos == 3) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.divicion);
            ImageView cargar = findViewById(R.id.imagenOperador);
            cargar.setImageDrawable(cargaImagen);
        }
        //NUMERO RANDOMICO ETIQUETA UNO
        if (numA == 0) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cero);
            ImageView cargar = findViewById(R.id.etiquetaNumeroUno);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numA == 1) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_uno);
            ImageView cargar = findViewById(R.id.etiquetaNumeroUno);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numA == 2) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_dos);
            ImageView cargar = findViewById(R.id.etiquetaNumeroUno);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numA == 3) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_tres);
            ImageView cargar = findViewById(R.id.etiquetaNumeroUno);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numA == 4) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cuatro);
            ImageView cargar = findViewById(R.id.etiquetaNumeroUno);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numA == 5) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cinco);
            ImageView cargar = findViewById(R.id.etiquetaNumeroUno);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numA == 6) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_seis);
            ImageView cargar = findViewById(R.id.etiquetaNumeroUno);
        }
        if (numA == 7) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_siete);
            ImageView cargar = findViewById(R.id.etiquetaNumeroUno);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numA == 8) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_ocho);
            ImageView cargar = findViewById(R.id.etiquetaNumeroUno);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numA == 9) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_nueve);
            ImageView cargar = findViewById(R.id.etiquetaNumeroUno);
            cargar.setImageDrawable(cargaImagen);
        }

        //NUMERO RANDOMICO ETIQUETA DOS
        if (numB == 0) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cero);
            ImageView cargar = findViewById(R.id.etiquetaNumeroDos);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numB == 1) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_uno);
            ImageView cargar = findViewById(R.id.etiquetaNumeroDos);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numB == 2) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_dos);
            ImageView cargar = findViewById(R.id.etiquetaNumeroDos);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numB == 3) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_tres);
            ImageView cargar = findViewById(R.id.etiquetaNumeroDos);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numB == 4) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cuatro);
            ImageView cargar = findViewById(R.id.etiquetaNumeroDos);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numB == 5) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cinco);
            ImageView cargar = findViewById(R.id.etiquetaNumeroDos);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numB == 6) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_seis);
            ImageView cargar = findViewById(R.id.etiquetaNumeroDos);
        }
        if (numB == 7) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_siete);
            ImageView cargar = findViewById(R.id.etiquetaNumeroDos);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numB == 8) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_ocho);
            ImageView cargar = findViewById(R.id.etiquetaNumeroDos);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numB == 9) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_nueve);
            ImageView cargar = findViewById(R.id.etiquetaNumeroDos);
            cargar.setImageDrawable(cargaImagen);
        }
        //NUMERO RANDOMICO ETIQUETA TRES
        if (numC == 0) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cero);
            ImageView cargar = findViewById(R.id.etiquetaNumeroTres);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numC == 1) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_uno);
            ImageView cargar = findViewById(R.id.etiquetaNumeroTres);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numC == 2) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_dos);
            ImageView cargar = findViewById(R.id.etiquetaNumeroTres);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numC == 3) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_tres);
            ImageView cargar = findViewById(R.id.etiquetaNumeroTres);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numC == 4) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cuatro);
            ImageView cargar = findViewById(R.id.etiquetaNumeroTres);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numC == 5) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cinco);
            ImageView cargar = findViewById(R.id.etiquetaNumeroTres);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numC == 6) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_seis);
            ImageView cargar = findViewById(R.id.etiquetaNumeroTres);
        }
        if (numC == 7) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_siete);
            ImageView cargar = findViewById(R.id.etiquetaNumeroTres);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numC == 8) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_ocho);
            ImageView cargar = findViewById(R.id.etiquetaNumeroTres);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numC == 9) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_nueve);
            ImageView cargar = findViewById(R.id.etiquetaNumeroTres);
            cargar.setImageDrawable(cargaImagen);
        }
        //NUMERO RANDOMICO ETIQUETA CUATRO
        if (numD == 0) {
            if (numC == 0) {
                Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_uno);
                ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
                cargar.setImageDrawable(cargaImagen);
            } else {
                Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cero);
                ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
                cargar.setImageDrawable(cargaImagen);
            }
        }
        if (numD == 1) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_uno);
            ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numD == 2) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_dos);
            ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numD == 3) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_tres);
            ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numD == 4) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cuatro);
            ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numD == 5) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_cinco);
            ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numD == 6) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_seis);
            ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
        }
        if (numD == 7) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_siete);
            ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numD == 8) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_ocho);
            ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
            cargar.setImageDrawable(cargaImagen);
        }
        if (numD == 9) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.rnd_nueve);
            ImageView cargar = findViewById(R.id.etiquetaNumeroCuatro);
            cargar.setImageDrawable(cargaImagen);
        }
    }

    private void Cargar(int r1, int r2) {
        if (r1 == r2) {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.bien_1);
            ImageView cargar = findViewById(R.id.imagenBienMal);
            cargar.setImageDrawable(cargaImagen);
            cargar.setVisibility(View.VISIBLE);
            MediaPlayer acertadosonido = MediaPlayer.create(this, R.raw.acertado);
            acertadosonido.start();
            B_M = "Correcto";
            contadorBuenas++;
        } else {
            Drawable cargaImagen = this.getResources().getDrawable(R.drawable.mal_1);
            ImageView cargar = findViewById(R.id.imagenBienMal);
            cargar.setImageDrawable(cargaImagen);
            cargar.setVisibility(View.VISIBLE);
            MediaPlayer hahasonido = MediaPlayer.create(this, R.raw.haha);
            hahasonido.start();
            B_M = "Incorrecto";
            Vibrator vibracion = (Vibrator) this.context.getSystemService(Context.VIBRATOR_SERVICE);
            vibracion.vibrate(1000);
            contadorMalas++;
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imagenUno:
                int a;
                TextView uno = findViewById(R.id.etiquetaRespuesta);
                a = (Integer.parseInt(uno.getText().toString()) * 10) + 1;
                uno.setText(String.valueOf(a));
                MediaPlayer sonido_1 = MediaPlayer.create(this, R.raw.boton);
                sonido_1.start();
                break;
            case R.id.imagenDos:
                int b;
                TextView dos = findViewById(R.id.etiquetaRespuesta);
                b = (Integer.parseInt(dos.getText().toString()) * 10) + 2;
                dos.setText(String.valueOf(b));
                MediaPlayer sonido_2 = MediaPlayer.create(this, R.raw.boton);
                sonido_2.start();
                break;
            case R.id.imagenTres:
                int c;
                final TextView tres = findViewById(R.id.etiquetaRespuesta);
                c = (Integer.parseInt(tres.getText().toString()) * 10) + 3;
                tres.setText(String.valueOf(c));
                MediaPlayer sonido_3 = MediaPlayer.create(this, R.raw.boton);
                sonido_3.start();
                break;
            case R.id.imagenCuatro:
                int d;
                TextView cuatro = findViewById(R.id.etiquetaRespuesta);
                d = (Integer.parseInt(cuatro.getText().toString()) * 10) + 4;
                cuatro.setText(String.valueOf(d));
                MediaPlayer sonido_4 = MediaPlayer.create(this, R.raw.boton);
                sonido_4.start();
                break;
            case R.id.imagenCinco:
                int e;
                TextView cinco = findViewById(R.id.etiquetaRespuesta);
                e = (Integer.parseInt(cinco.getText().toString()) * 10) + 5;
                cinco.setText(String.valueOf(e));
                MediaPlayer sonido_5 = MediaPlayer.create(this, R.raw.boton);
                sonido_5.start();
                break;
            case R.id.imagenSeis:
                int f;
                TextView seis = findViewById(R.id.etiquetaRespuesta);
                f = (Integer.parseInt(seis.getText().toString()) * 10) + 6;
                seis.setText(String.valueOf(f));
                MediaPlayer sonido_6 = MediaPlayer.create(this, R.raw.boton);
                sonido_6.start();
                break;
            case R.id.imagenSiete:
                int g;
                TextView siete = findViewById(R.id.etiquetaRespuesta);
                g = (Integer.parseInt(siete.getText().toString()) * 10) + 7;
                siete.setText(String.valueOf(g));
                MediaPlayer sonido_7 = MediaPlayer.create(this, R.raw.boton);
                sonido_7.start();
                break;
            case R.id.imagenOcho:
                int h;
                TextView ocho = findViewById(R.id.etiquetaRespuesta);
                h = (Integer.parseInt(ocho.getText().toString()) * 10) + 8;
                ocho.setText(String.valueOf(h));
                MediaPlayer sonido_8 = MediaPlayer.create(this, R.raw.boton);
                sonido_8.start();
                break;
            case R.id.imagenNueve:
                int i;
                TextView nueve = findViewById(R.id.etiquetaRespuesta);
                i = (Integer.parseInt(nueve.getText().toString()) * 10) + 9;
                nueve.setText(String.valueOf(i));
                MediaPlayer sonido_9 = MediaPlayer.create(this, R.raw.boton);
                sonido_9.start();
                break;
            case R.id.imagenCero:
                int j;
                TextView cero = findViewById(R.id.etiquetaRespuesta);
                j = (Integer.parseInt(cero.getText().toString()) * 10);
                cero.setText(String.valueOf(j));
                MediaPlayer sonido_0 = MediaPlayer.create(this, R.raw.boton);
                sonido_0.start();
                break;
            case R.id.botonMenos:
                int x;
                TextView menos = findViewById(R.id.etiquetaRespuesta);
                x = (Integer.parseInt(menos.getText().toString()) * -1);
                menos.setText(String.valueOf(x));
                MediaPlayer sonido_menos = MediaPlayer.create(this, R.raw.boton);
                sonido_menos.start();
                break;
            case R.id.botonVolver_F:
                //Cambio de Layouts Nivel Facil
                finish();
                if (musica != null) {
                    musica.stop();
                    musica.release();
                    musica = null;
                    MediaPlayer musica_S = MediaPlayer.create(this, R.raw.salir);
                    musica_S.start();
                    Intent intento_V = new Intent(AvanzadoActivity.this, JugarActivity.class);
                    startActivity(intento_V);
                    break;
                } else {
                    MediaPlayer musica_S = MediaPlayer.create(this, R.raw.salir);
                    musica_S.start();
                    Intent intento_V = new Intent(AvanzadoActivity.this, JugarActivity.class);
                    startActivity(intento_V);
                    break;
                }
            case R.id.botonEmpezar:
                Cargar();
                musica = MediaPlayer.create(this, R.raw.mariounminuto);
                musica.start();
                ImageButton bloquear = findViewById(R.id.botonEmpezar);
                bloquear.setEnabled(false);
                //Desbloquear Botones
                ImageButton desbloquear_V = findViewById(R.id.botonValidar);
                ImageButton desbloquear_C = findViewById(R.id.botonCorregir);
                ImageView cargarUno = findViewById(R.id.imagenUno);
                ImageView cargarDos = findViewById(R.id.imagenDos);
                ImageView cargarTres = findViewById(R.id.imagenTres);
                ImageView cargarCuatro = findViewById(R.id.imagenCuatro);
                ImageView cargarCinco = findViewById(R.id.imagenCinco);
                ImageView cargarSeis = findViewById(R.id.imagenSeis);
                ImageView cargarSiete = findViewById(R.id.imagenSiete);
                ImageView cargarOcho = findViewById(R.id.imagenOcho);
                ImageView cargarNueve = findViewById(R.id.imagenNueve);
                ImageView cargarCero = findViewById(R.id.imagenCero);
                ImageView menos_D = findViewById(R.id.botonMenos);
                desbloquear_C.setEnabled(true);
                desbloquear_V.setEnabled(true);
                cargarCero.setEnabled(true);
                cargarUno.setEnabled(true);
                cargarDos.setEnabled(true);
                cargarTres.setEnabled(true);
                cargarCuatro.setEnabled(true);
                cargarCinco.setEnabled(true);
                cargarSeis.setEnabled(true);
                cargarSiete.setEnabled(true);
                cargarOcho.setEnabled(true);
                cargarNueve.setEnabled(true);
                menos_D.setEnabled(true);
                //Cronometro
                cronometro = findViewById(R.id.etiquetaCronometro);
                if (!actividad) {
                    new CountDownTimer(60000, 1000) {
                        public void onTick(long millisUntilFinished) {
                            cronometro.setText(String.valueOf(millisUntilFinished / 1000));
                        }

                        @SuppressLint("SetTextI18n")
                        public void onFinish() {
                            cronometro.setTextSize(28);
                            cronometro.setText("Se Termino su Tiempo...!");
                            ImageButton desbloquear_V = findViewById(R.id.botonValidar);
                            ImageButton desbloquear_C = findViewById(R.id.botonCorregir);
                            ImageView cargarUno = findViewById(R.id.imagenUno);
                            ImageView cargarDos = findViewById(R.id.imagenDos);
                            ImageView cargarTres = findViewById(R.id.imagenTres);
                            ImageView cargarCuatro = findViewById(R.id.imagenCuatro);
                            ImageView cargarCinco = findViewById(R.id.imagenCinco);
                            ImageView cargarSeis = findViewById(R.id.imagenSeis);
                            ImageView cargarSiete = findViewById(R.id.imagenSiete);
                            ImageView cargarOcho = findViewById(R.id.imagenOcho);
                            ImageView cargarNueve = findViewById(R.id.imagenNueve);
                            ImageView cargarCero = findViewById(R.id.imagenCero);
                            ImageView menos_D = findViewById(R.id.botonMenos);
                            ImageButton empezar = findViewById(R.id.botonEmpezar);
                            desbloquear_C.setEnabled(false);
                            desbloquear_V.setEnabled(false);
                            cargarCero.setEnabled(false);
                            cargarUno.setEnabled(false);
                            cargarDos.setEnabled(false);
                            cargarTres.setEnabled(false);
                            cargarCuatro.setEnabled(false);
                            cargarCinco.setEnabled(false);
                            cargarSeis.setEnabled(false);
                            cargarSiete.setEnabled(false);
                            cargarOcho.setEnabled(false);
                            cargarNueve.setEnabled(false);
                            menos_D.setEnabled(false);
                            empezar.setEnabled(true);

                            //Messagge Box Resultados
                            AlertDialog.Builder advertencia = new AlertDialog.Builder(context);
                            float eficiencia = ((contadorBuenas) / (contadorBuenas + contadorMalas + (1 / 10))) * 100;
                            float agilidad = ((contadorBuenas) / 12) * 100;
                            advertencia.setMessage(resultados.toString() + "\n" + "      ---- TOTAL: ----" + "\n\nTOTAL BUENAS: " + contadorBuenas + "\nTOTAL MALAS: " + contadorMalas + "\n\n     ---- RENDIMIENTO:---\n\n" + "EFICIENCIA: " + eficiencia + "%\n" + "AGILIDAD: " + agilidad + "%")
                                    .setTitle("Aqui estan tu Resultados.")
                                    .setCancelable(false)
                                    .setNegativeButton("OK",
                                            new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int id) {
                                                    dialog.cancel();
                                                    resultados.clear();
                                                    contadorBuenas = 0;
                                                    contadorMalas = 0;
                                                }
                                            });
                            AlertDialog alerta = advertencia.create();
                            alerta.show();
                            alerta.getWindow().setLayout(1200, 1600);
                        }
                    }.start();
                }
                break;
            case R.id.botonValidar:
                int r1;
                int r2;
                TextView respuesta = findViewById(R.id.etiquetaRespuesta);
                r2 = (Integer.parseInt(respuesta.getText().toString()));
                // Para obtener el resultado de la operación:
                //SUMA:
                if (simbolos == 0) {
                    r1 = ((numA * 10) + numB) + ((numC * 10) + numD);
                    Cargar(r1, r2);
                    resultados.add(((numA * 10) + numB) + " + " + ((numC * 10) + numD) + " = " + r2 + ", " + B_M + "\n");
                }
                //RESTA:
                else if (simbolos == 1) {
                    r1 = ((numA * 10) + numB) - ((numC * 10) + numD);
                    Cargar(r1, r2);
                    resultados.add(((numA * 10) + numB) + " - " + ((numC * 10) + numD) + " = " + r2 + ", " + B_M + "\n");
                }
                //MULTIPLICACIÓN:
                else if (simbolos == 2) {
                    r1 = ((numA * 10) + numB) * ((numC * 10) + numD);
                    Cargar(r1, r2);
                    resultados.add(((numA * 10) + numB) + " x " + ((numC * 10) + numD) + " = " + r2 + ", " + B_M + "\n");
                }
                //DIVISIÓN:
                else if (simbolos == 3) {
                    if (numC == 0 && numD == 0) {
                        numD = 1;
                        r1 = ((numA * 10) + numB) / ((numC * 10) + numD);
                        Cargar(r1, r2);
                        resultados.add(((numA * 10) + numB) + " / " + ((numC * 10) + numD) + " = " + r2 + ", " + B_M + "\n");
                    } else {
                        r1 = ((numA * 10) + numB) / ((numC * 10) + numD);
                        Cargar(r1, r2);
                        resultados.add(((numA * 10) + numB) + " / " + ((numC * 10) + numD) + " = " + r2 + ", " + B_M + "\n");
                    }
                }
                //
                respuesta.setText("0");
                Cargar();
                break;
            case R.id.botonCorregir:
                int r3;
                int r4;
                TextView corregir = findViewById(R.id.etiquetaRespuesta);
                r3 = Integer.parseInt(corregir.getText().toString());
                r4 = (r3 / 10);
                corregir.setText(String.valueOf(r4));
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facil);
        //Para bloquear la pantalla en un solo formato
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Boton de Cambio de Layout a Jugar
        ImageButton volver = findViewById(R.id.botonVolver_F);
        volver.setOnClickListener(this);

        //Boton Empezar Cronometro
        ImageButton empezar = findViewById(R.id.botonEmpezar);
        empezar.setOnClickListener(this);

        //Boton Uno
        ImageView cargarUno = findViewById(R.id.imagenUno);
        cargarUno.setEnabled(false);
        cargarUno.setOnClickListener(this);
        //Boton Dos
        ImageView cargarDos = findViewById(R.id.imagenDos);
        cargarDos.setEnabled(false);
        cargarDos.setOnClickListener(this);
        //Boton Tres
        ImageView cargarTres = findViewById(R.id.imagenTres);
        cargarTres.setEnabled(false);
        cargarTres.setOnClickListener(this);
        //Boton Cuatro
        ImageView cargarCuatro = findViewById(R.id.imagenCuatro);
        cargarCuatro.setEnabled(false);
        cargarCuatro.setOnClickListener(this);
        //Boton Cinco
        ImageView cargarCinco = findViewById(R.id.imagenCinco);
        cargarCinco.setEnabled(false);
        cargarCinco.setOnClickListener(this);
        //Boton Seis
        ImageView cargarSeis = findViewById(R.id.imagenSeis);
        cargarSeis.setEnabled(false);
        cargarSeis.setOnClickListener(this);
        //Boton Siete
        ImageView cargarSiete = findViewById(R.id.imagenSiete);
        cargarSiete.setEnabled(false);
        cargarSiete.setOnClickListener(this);
        //Boton Ocho
        ImageView cargarOcho = findViewById(R.id.imagenOcho);
        cargarOcho.setEnabled(false);
        cargarOcho.setOnClickListener(this);
        //Boton Nueve
        ImageView cargarNueve = findViewById(R.id.imagenNueve);
        cargarNueve.setEnabled(false);
        cargarNueve.setOnClickListener(this);
        //Boton Cero
        ImageView cargarCero = findViewById(R.id.imagenCero);
        cargarCero.setEnabled(false);
        cargarCero.setOnClickListener(this);
        //Boton Menos
        ImageView menos = findViewById(R.id.botonMenos);
        menos.setEnabled(false);
        menos.setOnClickListener(this);
        //Boton Verificar
        ImageButton verificar = findViewById(R.id.botonValidar);
        verificar.setEnabled(false);
        verificar.setOnClickListener(this);
        //Bloqear Corregir
        ImageButton bloquear_C = findViewById(R.id.botonCorregir);
        bloquear_C.setEnabled(false);
        bloquear_C.setOnClickListener(this);
    }
}