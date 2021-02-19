package com.example.calcu_covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout main;
    private int vglobal = 0;
    private TextView TextoResultado, msg;
    private RadioButton s1, s2, p1, p2, p3, p4;
    //private EditText TextoResultado;
    //private EditText edad;
    private Spinner edades;
    private RadioGroup g1, g2;
    private CheckBox c1,c2,c3,c4,c5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edades = (Spinner) findViewById(R.id.sEdad);
        //TextoResultado = (TextView) findViewById(R.id.txtView1);
        //Riesgo = (TextView) findViewById(R.id.vResult);
        TextoResultado = (TextView) findViewById(R.id.vResult);

        //TextoResultado = findViewById(R.id.txtView1);
        //TextoResultado.setFocusable(true);
        //TextoResultado.setFocusableInTouchMode(true);
        //TextoResultado.setInputType(InputType.TYPE_NULL);

        s1 = (RadioButton) findViewById(R.id.sHombre);
        s2 = (RadioButton) findViewById(R.id.sMujer);

        p1 = (RadioButton) findViewById(R.id.pBajo);
        p2 = (RadioButton) findViewById(R.id.pNormal);
        p3 = (RadioButton) findViewById(R.id.pSobre);
        p4 = (RadioButton) findViewById(R.id.pObe);

        g1 = (RadioGroup) findViewById(R.id.groupRadio);
        g2 = (RadioGroup) findViewById(R.id.groupRadioPeso);


        c1 = (CheckBox) findViewById(R.id.checkPadecimiento1);
        c2 = (CheckBox) findViewById(R.id.checkPadecimiento2);
        c3 = (CheckBox) findViewById(R.id.checkPadecimiento3);
        c4 = (CheckBox) findViewById(R.id.checkPadecimiento4);
        c5 = (CheckBox) findViewById(R.id.checkPadecimiento5);
        msg = (TextView) findViewById(R.id.vMensaje);

        // e.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        //edad.setBackgroundTintMode();
        //e.setOnClickListener( new View.OnClickListener(){
        edades.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextoResultado.setText("0");
                vglobal=0;
                Validar();
                Enfermedades();
                if(vglobal > 2){
                    Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                TextoResultado.setText("0");
                vglobal=0;
                Validar();
               Enfermedades();
                if(vglobal > 2){
                    Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }
            }
        });
        g2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                TextoResultado.setText("0");
                vglobal=0;
                Validar();
                Enfermedades();
                if(vglobal > 2){
                    Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }
            }
        });

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c1.isChecked()){
                    mas();
                    vglobal++;
                }else{
                    if(!c1.isChecked()){
                        menos();
                        vglobal--;
                    }
                }
                if(vglobal > 2){
                    Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }
            }
        });

        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c2.isChecked()){
                    mas();
                    vglobal++;
                }else{
                    if(!c2.isChecked()){
                        menos();
                        vglobal--;
                    }
                }
                if(vglobal > 2){
                    Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c3.isChecked()){
                    mas();
                    vglobal++;
                }else{
                    if(!c3.isChecked()){
                        menos();
                        vglobal--;
                    }
                }
                if(vglobal > 2){
                    Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c4.isChecked()){
                    mas();
                    vglobal++;

                }else{
                    if(!c4.isChecked()){
                        menos();
                        vglobal--;
                    }
                }
                if(vglobal > 2){
                    Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }
            }
        });

        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(c5.isChecked()){
                    mas();
                    vglobal++;
                }else{
                    if(!c5.isChecked()){
                        menos();
                        vglobal--;
                    }
                }
                if(vglobal > 2){
                    Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void Enfermedades(){
        if(c1.isChecked()){
            mas();
            vglobal++;
        }
        if(c2.isChecked()){
            mas();
            vglobal++;
        }
        if(c3.isChecked()){
            mas();
            vglobal++;
        }
        if(c4.isChecked()){
            mas();
            vglobal++;
        }
        if(c5.isChecked()){
            mas();
            vglobal++;
        }
    }

    public void Validar(){
        int saveEdad = Integer.parseInt((String) edades.getSelectedItem());
        if(s1.isChecked()){
        mas();
        Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
        if(saveEdad <= 45){
            Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
            if(p1.isChecked() || p2.isChecked()){
                Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
            }else{
                if(p3.isChecked() || p4.isChecked()){
                    mas();
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }
            }
            }else{
            if(saveEdad >= 46){
                mas();
                Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                if(p1.isChecked() || p2.isChecked()){
                    Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }else{
                    if(p3.isChecked() || p4.isChecked()){
                        mas();
                        Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }
    }

        if(s2.isChecked()){
            Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
            if(Integer.parseInt((String) TextoResultado.getText()) != 0){
                menos();
            }else{
                if(saveEdad <= 53){
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                    if(p1.isChecked() || p2.isChecked()){
                    Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                }else{
                    if(p3.isChecked() || p4.isChecked()){
                        mas();
                        Toast.makeText(MainActivity.this, "En riesgo moderado por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                    }
                }
                }else{
                    if(saveEdad >= 54){
                        mas();
                        Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                        if(p1.isChecked() || p2.isChecked()){
                            Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                        }else{
                        if(p3.isChecked() || p4.isChecked()){
                            mas();
                            Toast.makeText(MainActivity.this, "En riesgo alto por contagio de COVID-19", Toast.LENGTH_SHORT).show();
                        }
                    }
                    }
                }
            }
        }
    }

    public void mas() {
        String textAnterior = (String) TextoResultado.getText();
        int x = Integer.parseInt(textAnterior) + 1;
        TextoResultado.setText(String.valueOf(x));
    }

    public void menos () {
        String textAnterior = (String) TextoResultado.getText();
        int x = Integer.parseInt(textAnterior) - 1;
        TextoResultado.setText(String.valueOf(x));
    }

}