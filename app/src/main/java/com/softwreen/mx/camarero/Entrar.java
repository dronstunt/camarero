package com.softwreen.mx.camarero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Entrar extends AppCompatActivity {

    TextView Registrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);

        TextView Registrate = (TextView) findViewById(R.id.tvRegistrate);

        Registrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Registro = new Intent(getApplicationContext(), Registro.class);
                startActivity(Registro);
            }
        });

    }
}
