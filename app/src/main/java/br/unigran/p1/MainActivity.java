package br.unigran.p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;


import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText kms;
    EditText qtd;
    EditText data;
    EditText valor_final;
    List <abastecimento> abastecimento;
    ListView abastecimentos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}