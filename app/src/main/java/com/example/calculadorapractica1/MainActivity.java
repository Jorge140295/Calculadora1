package com.example.calculadorapractica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tvdisplay;
    double n1, n2, res;
    String Operador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bcero(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + "0");

    }

    public void buno(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + "1");

    }

    public void bdos(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + "2");

    }

    public void btres(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + "3");

    }

    public void bcuatro(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + "4");

    }

    public void bcinco(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + "5");

    }

    public void bseis(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + "6");

    }

    public void bsiete(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + "7");

    }

    public void bocho(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + "8");

    }

    public void bnueve(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + "9");

    }

    public void bpunto(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        tvdisplay.setText(tvdisplay.getText() + ".");

    }

    public void onClickOperacionCapturaNumero1(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        n1 = Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText("");
    }

    public void bsumar(View view) {
        Operador = "+";
        onClickOperacionCapturaNumero1(view);
    }

    public void bresta(View view) {
        Operador = "-";
        onClickOperacionCapturaNumero1(view);
    }

    public void bmultiplicacion(View view) {
        Operador = "*";
        onClickOperacionCapturaNumero1(view);
    }

    public void bdivision(View view) {
        Operador = "/";
        onClickOperacionCapturaNumero1(view);
    }

    public void expcuadrado(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        try {
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            res = Math.pow(n1, 2);
            tvdisplay.setText(String.valueOf(res));

        } catch (NumberFormatException nfe) {

        }

    }

    public void expcubo(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        try {
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            res = Math.pow(n1, 3);
            tvdisplay.setText(String.valueOf(res));

        } catch (NumberFormatException nfe) {

        }

    }

    public void sen(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        try {

            n1 = Double.parseDouble(tvdisplay.getText().toString());
            double rd = Math.toRadians(n1);
            res = Math.sin(rd);
            tvdisplay.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {


        }

    }

    public void cos(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        try {

            n1 = Double.parseDouble(tvdisplay.getText().toString());
            double rd = Math.toRadians(n1);
            res = Math.cos(rd);
            tvdisplay.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {


        }
    }

    public void tang(View view) {
        tvdisplay = (TextView) findViewById(R.id.tv1);
        try {

            n1 = Double.parseDouble(tvdisplay.getText().toString());
            double rd = Math.toRadians(n1);
            res = Math.tan(rd);
            tvdisplay.setText(String.valueOf(res));
        } catch (NumberFormatException nfe) {


        }

    }
    public void borrarult(View view){
      if (tvdisplay.getText().toString().equals("")){
          tvdisplay.setText(tvdisplay.getText().subSequence(0,tvdisplay.getText().length()-1)+"");

      }

    }
    public void borrartodo(View view){
        n1=0.0;
        n2=0.0;
        tvdisplay=(TextView)findViewById(R.id.tv1);
        tvdisplay.setText("");

    }
    public void salir(View view){
      finish();

    }
    public void bigual(View view){
        tvdisplay=(TextView)findViewById(R.id.tv1);
        n2=Double.parseDouble(tvdisplay.getText().toString());
        if (Operador.equals("+")){
            res=n1+n2;
        }else if (Operador.equals("-")){
            res=n1-n2;
        }else if (Operador.equals("*")){
            res=n1*n2;
        }else if (Operador.equals("/")){
            res=n1/n2;
        }else if (Operador.equals("exp")){
            tvdisplay=(TextView)findViewById(R.id.tv1);
            n2=Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText("");
            res=Math.pow(n1,n2);

        }
        tvdisplay.setText(""+res);
    }
    public void exp(View view){

        Operador="exp";
        tvdisplay=(TextView)findViewById(R.id.tv1);
        try {
            n1=Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText("");
        }catch (NumberFormatException nfe){}


    }
}