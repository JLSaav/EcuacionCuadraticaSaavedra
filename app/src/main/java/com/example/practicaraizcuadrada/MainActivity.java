package com.example.practicaraizcuadrada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintsChangedListener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText valor1, valor2, valor3;
    Button Calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calcular= (Button) findViewById(R.id.bc);
        valor1 = (EditText) findViewById(R.id.vl);
        valor2 = (EditText) findViewById(R.id.vll);
        valor3 = (EditText) findViewById(R.id.vlll);

        Calcular. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String v1 = valor1.getText().toString();
                String v2 = valor2.getText().toString();
                String v3 = valor3.getText().toString();

                if (v1.isEmpty() || v2.isEmpty() || v3.isEmpty() ) {
                    if (v1.isEmpty())
                        valor1.setError("No ha Ingresado número");
                    if (v2.isEmpty())
                        valor2.setError("No ha Ingresado número");
                    if (v3.isEmpty())
                        valor1.setError("No ha Ingresado número");
                } else {


                     double na = Double.parseDouble(v1);
                     double nb = Double.parseDouble(v2);
                     double nc = Double.parseDouble(v3);

                     double discriminante = ((nb*nb)-4*na*nc);

                     if (discriminante<0){
                         Toast.makeText( MainActivity.this,"No tiene solución:", Toast.LENGTH_LONG).show();
                     }
                  else{
                      double x1;
                      double x2;
                      x1=(-nb+Math.sqrt(discriminante))/(2*na);
                      x2=(-nb-Math.sqrt(discriminante))/(2*na);
                         Toast.makeText( MainActivity.this,"resultado x1:"+x1, Toast.LENGTH_LONG).show();
                         Toast.makeText( MainActivity.this,"resultado x2:"+x2, Toast.LENGTH_LONG).show();
                     }

                }

            }
        });





        }}

