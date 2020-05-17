package br.unipar.bolsavalores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //declarando objetos da tela
    EditText tvAtivo;
    EditText tvLucroLiquido;
    EditText tvPatrimonioLiquido;
    EditText tvNumAcao;
    EditText tvPrecoAtual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //associa os objetos
        tvAtivo = (EditText) findViewById(R.id.tvAtivo);
        tvLucroLiquido = (EditText) findViewById(R.id.tvLucroLiquido);
        tvPatrimonioLiquido = (EditText) findViewById(R.id.tvPatrimonioLiquido);
        tvNumAcao = (EditText) findViewById(R.id.tvNumAcao);
        tvPrecoAtual = (EditText) findViewById(R.id.tvPrecoAtual);
    }

    public void calc(View v) {

        double lucroLiquido = Float.parseFloat(tvLucroLiquido.getText().toString());
        double numAcao = Float.parseFloat(tvNumAcao.getText().toString());
        double patrimonioLiquido = Float.parseFloat(tvPatrimonioLiquido.getText().toString());
        double precoAtual = Float.parseFloat(tvPrecoAtual.getText().toString());

        double lpa = (lucroLiquido / numAcao);
        double pl = (precoAtual / lpa);
        double roe = (lucroLiquido / patrimonioLiquido) * 100;
        double vpa = (patrimonioLiquido / numAcao);
        double pvp = (precoAtual / vpa);


        Intent intent = new Intent(MainActivity.this, Resultado.class);
        Bundle b = new Bundle();
        b.putDouble("lpa", lpa);
        b.putDouble("pl", pl);
        b.putDouble("roe", roe);
        b.putDouble("vpa", vpa);
        b.putDouble("pvp", pvp);
        intent.putExtras(b);
        startActivity(intent);
        finish();

    }





        }



