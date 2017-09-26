package br.com.senai.clientewebservice2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Runnable{

    Button btnEnviar,btnReceber;
    EditText edtTexto, edtResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ligaJavaComXML();
    }

    @Override
    public void run(){

    }
    public void ligaJavaComXML(){
        btnEnviar = (Button)findViewById(R.id.btnEnviar);
        btnReceber = (Button)findViewById(R.id.btnReceber);
        edtTexto = (EditText)findViewById(R.id.edtTexto);
        edtResposta = (EditText)findViewById(R.id.edtResposta);
    }
}
