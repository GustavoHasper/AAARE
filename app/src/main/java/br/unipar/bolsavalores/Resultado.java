package br.unipar.bolsavalores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {






    //declara objeto da tela
    TextView tvLPA;
    TextView tvPL;
    TextView tvROE;
    TextView tvVPA;
    TextView tvPVP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //associando objetos
        tvLPA = (TextView)findViewById(R.id.tvLPA);
        tvPL = (TextView)findViewById(R.id.tvPL);
        tvROE = (TextView)findViewById(R.id.tvROE);
        tvVPA = (TextView)findViewById(R.id.tvVPA);
        tvPVP = (TextView)findViewById(R.id.tvPVP);

        Bundle b = getIntent().getExtras();
        assert b != null;
        double lpa = b.getDouble("lpa");
        double pl = b.getDouble("pl");
        double roe = b.getDouble("roe");
        double vpa = b.getDouble("vpa");
        double pvp = b.getDouble("pvp");

        String tLPA = "Valor do LPA: " + lpa;

        String tPL = "Valor do P/L: " + pl;

        String tROE = "Valor do ROE: " + roe;

        String tVPA = "Valor do VPA:" + vpa;

        String tPVP = "Valor do P/VP:" + pvp;

        tvLPA.setText(tLPA);
        tvPL.setText(tPL);
        tvROE.setText(tROE);
        tvVPA.setText(tVPA);
        tvPVP.setText(tPVP);

        }


        }



