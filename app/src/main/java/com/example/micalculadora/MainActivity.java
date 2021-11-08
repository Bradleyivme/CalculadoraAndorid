package com.example.micalculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtver;
    private float apoyo = 0, resultado = 0;
    private String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtver = (EditText)findViewById(R.id.txtver);
    }

    private void Operacion_Guardada(String op){

        this.apoyo = Integer.parseInt(this.txtver.getText().toString());
        this.operacion = op;
        this.txtver.setText("");

    }

    private void Mostrar_Numeros(String numero){

        String valor_ver = this.txtver.getText().toString();
        valor_ver = valor_ver + numero;
        this.txtver.setText(valor_ver);
    }

    public void Click_btnresult(View v){
        float apoyo2 = Integer.parseInt(this.txtver.getText().toString());

        if(this.operacion.equals("+")){
            this.resultado = this.apoyo + apoyo2;
        } else if(this.operacion.equals("-")){
            this.resultado = this.apoyo - apoyo2;
        } else if(this.operacion.equals("/")){
            this.resultado = this.apoyo / apoyo2;
        } else if(this.operacion.equals("*")){
            this.resultado = this.apoyo * apoyo2;
        }

        this.txtver.setText(String.valueOf(this.resultado));

    }

    public void Click_btninfo(View v){
        Intent Informacion = new Intent(this, com.example.micalculadora.Informacion.class);
        startActivity(Informacion);
    }

    public void Click_btnclear(View v){
        this.txtver.setText("");
    }

    public void Click_btnmas(View v){
        Operacion_Guardada("+");
    }

    public void Click_btnmenos(View v){
        Operacion_Guardada("-");
    }

    public void Click_btndivision(View v){
        Operacion_Guardada("/");
    }

    public void Click_btnmulti(View v){
        Operacion_Guardada("*");
    }

    public void Click_btn1(View v){
        Mostrar_Numeros("1");
    }

    public void Click_btn2(View v){
        Mostrar_Numeros("2");
    }

    public void Click_btn3(View v){
        Mostrar_Numeros("3");
    }

    public void Click_btn4(View v){
        Mostrar_Numeros("4");
    }

    public void Click_btn5(View v){
        Mostrar_Numeros("5");
    }

    public void Click_btn6(View v){
        Mostrar_Numeros("6");
    }

    public void Click_btn7(View v){
        Mostrar_Numeros("7");
    }

    public void Click_btn8(View v){
        Mostrar_Numeros("8");
    }

    public void Click_btn9(View v){
        Mostrar_Numeros("9");
    }

    public void Click_btn0(View v){
        Mostrar_Numeros("0");
    }

    public void Click_btnpunto(View v){
        Mostrar_Numeros(".");
    }
}